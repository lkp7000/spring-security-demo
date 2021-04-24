package com.gigatorb.springsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return "Welcome, This is user page.";
    }

    @GetMapping("/admin")
    public String admin(){
        return "Welcome, This is admin page.";
    }
}
