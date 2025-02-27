package com.tamishre.api.controller;

import com.tamishre.api.model.Featured;
import com.tamishre.api.model.Property;
import com.tamishre.api.repository.FeaturedRepository;
import com.tamishre.api.repository.PropertyRepository;
import com.tamishre.api.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class PropertyController {
    @Autowired
    PropertyRepository propertyRepository;

    @Autowired
    PropertyService propertyService;

    @Autowired
    FeaturedRepository featuredRepository;

    @Value("${environment.mailchimp_key}")
    String mailchimpKey;

    @Value("${environment.mailchimp_list}")
    String mailchimpList;

    @Value("${environment.mailchimp_region}")
    String mailchimpRegion;

    @GetMapping("/")
    public String home(Model model) {
        List<Featured> properties = featuredRepository.findAll();
        model.addAttribute("properties", properties);
        return "index";
    }

    @GetMapping("/property/{id}")
    public String property(@PathVariable("id") String id, Model model) throws IOException {
        Property property = propertyService.getProperty(id);
        if (property.getNumberOfPhotos() == null) {
            model.addAttribute("imagePath", "/images/fallback.jpg");
        } else {
            model.addAttribute("imagePath", "s3:");
        }
        model.addAttribute("property", property);
        // throw exception here
        return "property";
    }

    @GetMapping(path = "/search", params = {"query", "beds", "baths", "min-price", "max-price"})
    public String search(@RequestParam(name="query", defaultValue="") String query, @RequestParam(name="collection", required = false) String collection, @RequestParam(name="beds", defaultValue="0") int beds, @RequestParam(name="baths", defaultValue="0") int baths, @RequestParam(name="min-price", defaultValue="0") int minPrice, @RequestParam(name="max-price", defaultValue="2147483647") int maxPrice, @RequestParam(name="page", defaultValue="0") int page, @RequestParam(name="limit", defaultValue="12") int limit, Model model) {
        PageRequest pageRequest = PageRequest.of(page, limit, Sort.by("idxDt"));
        Page<Property> results = propertyRepository.searchProperties(query, collection, BigDecimal.valueOf(beds), BigDecimal.valueOf(baths), BigDecimal.valueOf(minPrice), BigDecimal.valueOf(maxPrice), pageRequest);
        model.addAttribute("properties", results.getContent());
        model.addAttribute("hasMore", results.hasNext());
        model.addAttribute("nextPage", page + 1);
        model.addAttribute("query", query);
        return "searchresults";
    }

    @GetMapping(path = "/search/{query}")
    public String search(@PathVariable("query") String query, Model model) {
        query = query.replaceAll("-", " ");
        PageRequest pageRequest = PageRequest.of(0, 12, Sort.by("idxDt"));
        Page<Property> results = propertyRepository.findByMlNumContainingIgnoreCaseOrAddrContainingIgnoreCaseOrAreaContainingIgnoreCaseAndBrGreaterThanEqualAndBathTotGreaterThanEqualAndLpDolBetween(query, query, query, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, new BigDecimal(2147483647), pageRequest);
        model.addAttribute("properties", results.getContent());
        model.addAttribute("hasMore", results.hasNext());
        model.addAttribute("nextPage", 1);
        return "search";
    }

    @GetMapping(path = "/search")
    public String search(Model model) {
        PageRequest pageRequest = PageRequest.of(0, 12, Sort.by("idxDt"));
        Page<Property> results = propertyRepository.findByMlNumContainingIgnoreCaseOrAddrContainingIgnoreCaseOrAreaContainingIgnoreCaseAndBrGreaterThanEqualAndBathTotGreaterThanEqualAndLpDolBetween("", "", "", BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, new BigDecimal(2147483647), pageRequest);
        model.addAttribute("properties", results.getContent());
        model.addAttribute("hasMore", results.hasNext());
        model.addAttribute("nextPage", 1);
        return "search";
    }

    @PostMapping(path = "/addcontact")
    public String addContact(@RequestParam(name="firstname") String firstName, @RequestParam(name="lastname") String lastName, @RequestParam(name="email") String email, Model model) {
        HashMap<String, String> mergeFields = new HashMap<>();
        mergeFields.put("FNAME", firstName);
        mergeFields.put("LNAME", lastName);
        RestTemplate restTemplate = new RestTemplate();


        String url = String.format("https://%s.api.mailchimp.com/3.0/lists/%s/members", mailchimpRegion, mailchimpList);
        HttpHeaders headers = new HttpHeaders();
        headers.setBasicAuth(mailchimpKey);
        HashMap<String, Object> body = new HashMap<>();
        body.put("email_address", email);
        body.put("status", "subscribed");
        body.put("merge_fields", mergeFields);
        HttpEntity<Map<String, Object>> request = new HttpEntity<>(body, headers);
        try {
            restTemplate.exchange(url, HttpMethod.POST, request, String.class);
            model.addAttribute("response", "Successfully subscribed!");
        } catch (HttpClientErrorException e) {
            String response = e.getResponseBodyAsString();
            System.out.println(response);
            if (response.contains("Member Exists")) model.addAttribute("response", "This email is already subscribed.");
            if (response.contains("Invalid Resource")) model.addAttribute("response", "Please provide a valid email address.");
        }
        return "addcontact";
    }


}
