package com.example.url_shortner;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class UrlMapping {

    @Id
    @GeneratedValue 
    private long id;

    private String longUrl;

    private String shortUrlKey;

    public UrlMapping(String longUrl, String shortUrlKey) {
        this.longUrl = longUrl;
        this.shortUrlKey = shortUrlKey;
    }
}