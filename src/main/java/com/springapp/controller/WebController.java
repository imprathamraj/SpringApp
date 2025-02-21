package com.springapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WebController {

    // UC2
    @GetMapping("/web")
    public String hello(Model model){
        model.addAttribute("hello","Hello from Pratham");
        return "hello";
    }

    @GetMapping("/web/message")
    public String message(Model model){
        model.addAttribute("message", "Hello form BridgeLabz");
        return "message";
    }
}