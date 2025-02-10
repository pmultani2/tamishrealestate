package com.tamishre.api.repository;

import com.tamishre.api.model.Featured;
import com.tamishre.api.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeaturedRepository extends JpaRepository<Featured, String> {
  List<Featured> findAll();
}