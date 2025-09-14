package com.example.url_shortner;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UrlMappingRepository extends JpaRepository<UrlMapping, Long> {
    // Spring Data JPA will automatically create a query for this method name!
    Optional<UrlMapping> findByShortUrlKey(String shortUrlKey);
}