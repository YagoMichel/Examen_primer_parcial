package com.yago.Examen.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class homeController {
    @GetMapping()
    public String home_index() {
        return "index";
    }
    
}
