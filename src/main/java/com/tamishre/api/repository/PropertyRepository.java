package com.tamishre.api.repository;

import com.tamishre.api.model.Property;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface PropertyRepository extends JpaRepository<Property, String> {
    Page<Property> findByMlNumContainingIgnoreCaseOrAddrContainingIgnoreCaseOrAreaContainingIgnoreCaseAndBrGreaterThanEqualAndBathTotGreaterThanEqualAndLpDolBetween(String mlNum, String addr, String area, BigDecimal br, BigDecimal bathTot, BigDecimal lpDol, BigDecimal lpDol2, Pageable pageable);
}