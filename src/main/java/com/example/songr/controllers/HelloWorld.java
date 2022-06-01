package com.example.songr.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@Controller
@RequestMapping("/hello")
public class HelloWorld {

    // Home route
    // rest the request method
    // Either: set a response body, or use a MODEL!!! Can NOT do both.


    @GetMapping("/hi")
    @ResponseBody
    public String getHi() {
        return "Congratulations on creating your first Spring MVC route. Study this.. These are simple concepts here buddy.";
    }

    // route with params
    @GetMapping("/capitalize/{name}")
    @ResponseBody
    public String upperCaseWords(@PathVariable String name){
        String upperCaseName = name.toUpperCase(Locale.ROOT);
        return "Hello, " + upperCaseName;
    }

    // route to Splash page
    @GetMapping("/VibeTime")
    @ResponseBody
    public static String splashPage(){
        return splashPage();
    }

}


