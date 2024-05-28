package com.regved.journalApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("/health_check")
    public String healthCheck(){
        return "You are Good";
    }
}
