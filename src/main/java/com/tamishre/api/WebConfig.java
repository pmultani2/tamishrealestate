package com.tamishre.api;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Map the external folder to a URL path
        registry.addResourceHandler("/photos/**")
                .addResourceLocations("file:/Users/prabnoormultani/Developer/rets-but-with-python/photos");
    }
}
