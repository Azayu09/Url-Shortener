package com.example.url_shortner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.net.URI;

@RestController
public class UrlController {

    @Autowired
    private UrlShortenerService urlShortenerService;

    // Endpoint to create a short URL
    @PostMapping("/shorten")
    public String shortenUrl(@RequestBody String longUrl) {
        String shortKey = urlShortenerService.shortenUrl(longUrl);
        // In a real app, you'd return the full URL e.g., "http://localhost:8080/" + shortKey
        return "Short URL Key: " + shortKey;
    }

    // Endpoint to redirect to the long URL
    @GetMapping("/{shortKey}")
    public ResponseEntity<Void> redirectToLongUrl(@PathVariable String shortKey) {
        String longUrl = urlShortenerService.getLongUrl(shortKey);
        return ResponseEntity.status(HttpStatus.FOUND)
                .location(URI.create(longUrl))
                .build();
    }
}