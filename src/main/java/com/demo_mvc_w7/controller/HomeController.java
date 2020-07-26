package com.demo_mvc_w7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String home()
    {
        return "/home";
    }

}
