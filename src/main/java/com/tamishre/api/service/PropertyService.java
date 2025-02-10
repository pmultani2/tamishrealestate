package com.tamishre.api.service;

import com.tamishre.api.model.Property;
import com.tamishre.api.repository.PropertyRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class PropertyService {
    private final PropertyRepository propertyRepository;

    public PropertyService(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    public Property getProperty(String mlNum) {
        return propertyRepository.findById(mlNum).orElse(null);
    }

    public int getPhotoMetadata(String mlNum) throws IOException {
        Path path = Paths.get("/Users/prabnoormultani/Developer/rets-but-with-python/photos/" + mlNum);
        return (int) Files.list(path).count();
    }
}
