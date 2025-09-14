package com.example.url_shortner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.commons.lang3.RandomStringUtils; // You might need to add this dependency

@Service
public class UrlShortenerService {

    @Autowired
    private UrlMappingRepository urlMappingRepository;

    public String shortenUrl(String longUrl) {
        // Generate a unique 6-character alphanumeric key
        String shortKey = RandomStringUtils.randomAlphanumeric(6);

        // In a real app, you'd check for collisions and regenerate if the key exists

        UrlMapping urlMapping = new UrlMapping(longUrl, shortKey);
        urlMappingRepository.save(urlMapping);

        return shortKey;
    }

    public String getLongUrl(String shortKey) {
        return urlMappingRepository.findByShortUrlKey(shortKey)
                .map(UrlMapping::getLongUrl) // If found, get the longUrl
                .orElseThrow(() -> new RuntimeException("URL not found for key: " + shortKey)); // Or throw an error
    }
}