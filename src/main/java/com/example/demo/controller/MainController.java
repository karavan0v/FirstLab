package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class MainController {

    @GetMapping("/")
    public String hello() {return "Hello, Karavanov Ivan Vladimirovich  " + LocalDate.now().toString();
    }

}
