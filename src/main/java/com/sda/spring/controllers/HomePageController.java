package com.sda.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {

    @GetMapping("/")
    public ModelAndView getHomepage(){
        ModelAndView modelAndView = new ModelAndView("main_page/homepage");
        return modelAndView;
    }
    @GetMapping("/home")
    public ModelAndView getHomepageHome(){
        ModelAndView modelAndView = new ModelAndView("main_page/homepage");
        return modelAndView;
    }
}
