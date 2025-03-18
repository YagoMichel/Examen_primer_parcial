package com.yago.Examen.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class loginController {
    @GetMapping("/login")
    public String get_login() {
        return "login_singUp/login";
    }
    @GetMapping("/singup")
    public String get_singup() {
        return "login_singUp/singup";
    }
    @GetMapping("/forgot")
    public String get_forgot() {
        return "login_singUp/forgot";
    }
    @PostMapping("/login")
    public String post_login() {
        return "index-admin";
    }
    @PostMapping("/forgot")
    public String post_forgot() {
        return "login_singUp/login";
    }
    @PostMapping("/singup")
    public String post_singup() {
        return "index-admin";
    }
    
}
