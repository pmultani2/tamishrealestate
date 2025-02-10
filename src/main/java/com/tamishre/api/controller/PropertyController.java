package com.tamishre.api.controller;

import com.tamishre.api.model.Featured;
import com.tamishre.api.model.Property;
import com.tamishre.api.repository.FeaturedRepository;
import com.tamishre.api.repository.PropertyRepository;
import com.tamishre.api.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;


@Controller
public class PropertyController {
    @Autowired
    PropertyRepository propertyRepository;

    @Autowired
    PropertyService propertyService;

    @Autowired
    FeaturedRepository featuredRepository;

    @GetMapping("/featured")
    public String featured(Model model) {
        List<Featured> properties = featuredRepository.findAll();
        model.addAttribute("properties", properties);
        return "featured";
    }

    @GetMapping("/property/{id}")
    public String property(@PathVariable("id") String id, Model model) throws IOException {
        Property property = propertyService.getProperty(id);
        model.addAttribute("property", property);
        model.addAttribute("photoCount", propertyService.getPhotoMetadata(id));
        // throw exception here
        return "property";
    }

    @GetMapping(path = "/search", params = {"query", "beds", "baths", "min-price", "max-price"})
    public String search(@RequestParam(name="query", defaultValue="") String query, @RequestParam(name="beds", defaultValue="0") BigDecimal beds, @RequestParam(name="baths", defaultValue="0") BigDecimal baths, @RequestParam(name="min-price", defaultValue="0") BigDecimal minPrice, @RequestParam(name="max-price", defaultValue="2147483647") BigDecimal maxPrice, @RequestParam(name="page", defaultValue="0") int page, @RequestParam(name="limit", defaultValue="12") int limit, Model model) {
        PageRequest pageRequest = PageRequest.of(page, limit, Sort.by("idxDt"));
        Page<Property> results = propertyRepository.findByMlNumContainingIgnoreCaseOrAddrContainingIgnoreCaseOrAreaContainingIgnoreCaseAndBrGreaterThanEqualAndBathTotGreaterThanEqualAndLpDolBetween(query, query, query, beds, baths, minPrice, maxPrice, pageRequest);
        model.addAttribute("properties", results.getContent());
        model.addAttribute("hasMore", results.hasNext());
        model.addAttribute("nextPage", page + 1);
        model.addAttribute("query", query);
        return "searchresults";
    }

    @GetMapping(path = "/search/{query}")
    public String search(@PathVariable("query") String query, Model model) {
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



}
