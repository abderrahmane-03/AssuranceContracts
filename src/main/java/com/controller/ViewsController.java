package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewsController {

    @GetMapping("/register")
    public ModelAndView showRegisterForm() {
        return new ModelAndView("register");
    }
    @GetMapping("/login")
    public ModelAndView showLoginForm() {
        return new ModelAndView("login");
    }
    @GetMapping("/")
    public ModelAndView insuranceHome() {
       return new ModelAndView("insurance");
    }
    @GetMapping("/insuranceList")
    public ModelAndView insuranceList() {
        return new ModelAndView("insurance");
    }
}

