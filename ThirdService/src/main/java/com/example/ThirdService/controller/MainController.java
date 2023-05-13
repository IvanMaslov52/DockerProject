package com.example.ThirdService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MainController {
    @GetMapping("/email/**")
    public String test() {
        System.out.println("email was sent");
        return "email was sent";
    }
}
