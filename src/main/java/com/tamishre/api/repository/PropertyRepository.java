package com.tamishre.api.repository;

import com.tamishre.api.model.Property;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;

public interface PropertyRepository extends JpaRepository<Property, String> {
    Page<Property> findByMlNumContainingIgnoreCaseOrAddrContainingIgnoreCaseOrAreaContainingIgnoreCaseAndBrGreaterThanEqualAndBathTotGreaterThanEqualAndLpDolBetween(String mlNum, String addr, String area, BigDecimal br, BigDecimal bathTot, BigDecimal lpDol, BigDecimal lpDol2, Pageable pageable);

    @Query("SELECT p FROM Property p " +
            "WHERE (:query IS NULL OR LOWER(p.mlNum) LIKE LOWER(CONCAT('%', :query, '%')) " +
            "OR LOWER(p.addr) LIKE LOWER(CONCAT('%', :query, '%')) " +
            "OR LOWER(p.area) LIKE LOWER(CONCAT('%', :query, '%'))) " +
            "AND (:collection IS NULL OR p.className = :collection) " +
            "AND (:beds IS NULL OR p.br >= :beds) " +
            "AND (:baths IS NULL OR p.bathTot >= :baths) " +
            "AND (:minPrice IS NULL OR p.lpDol >= :minPrice) " +
            "AND (:maxPrice IS NULL OR p.lpDol <= :maxPrice)")
    Page<Property> searchProperties(String query, String collection, BigDecimal beds, BigDecimal baths, BigDecimal minPrice, BigDecimal maxPrice, Pageable pageable);
}