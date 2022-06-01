package com.example.songr.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@Controller

public class HelloWorld {

    // Home route
    // rest the request method
    // Either: set a response body, or use a MODEL!!! Can NOT do both.

    // route to Splash page
    @GetMapping("/VibeTime")
    public String splashPage(){
        return "splashPage";
    }
    @GetMapping("/hi")
    @ResponseBody
    public String getHi() {
        return "Congratulations on creating your first Spring MVC route. Study this.. These are simple concepts here buddy.";
    }

    // route with params
    @GetMapping("/capitalize/{phrase}")
    @ResponseBody
    public String upperCaseWords(@PathVariable String phrase){
        String upperCaseName = phrase.toUpperCase(Locale.ROOT);
        return "Hello, " + upperCaseName;
    }
}


