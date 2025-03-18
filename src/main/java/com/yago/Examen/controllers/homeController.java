package com.yago.Examen.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class homeController {
    @GetMapping()
    public String home_index() {
        return "index";
    }
    @GetMapping("index/admin")
    public String home_index_admin() {
        return "index-admin";
    }
    
}
