package com.sharanprakash.UserRegistration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class registration {

    @GetMapping("/index")
    public String home(){
        return "index";
    }
}
