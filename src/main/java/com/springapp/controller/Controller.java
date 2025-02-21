package com.springapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    // UC3 Added Spring Boot Extension Pack
    @GetMapping("/hello")
    public String hello(){
        return "Hello form BridgeLabz";
    }
}