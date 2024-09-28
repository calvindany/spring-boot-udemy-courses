package com.springboot_1.demo.mydemoapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${student.name}")
    private String coachName;

    @GetMapping("/")
    public String sayHello() {
        return "Hello World " + coachName.toUpperCase();
    }

    @GetMapping("/test")
    public String sayTest() { return "Test Page"; }
}
