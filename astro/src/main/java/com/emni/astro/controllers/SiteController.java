package com.emni.astro.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SiteController {

    @GetMapping("/")
    public String homeSite() {
        return "Testing";
    }
}
