package com.example.SecondService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MainController {
    @GetMapping("/push/**")
    public String test() {
        System.out.println("push was sent");
        return "push was sent";
    }
}
