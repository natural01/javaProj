package com.home.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "main page");
        return "home";
    }

    @GetMapping("/myPage")
    public String myPage(Model model) {
        model.addAttribute("title", "home");
        return "myPage";
    }

}