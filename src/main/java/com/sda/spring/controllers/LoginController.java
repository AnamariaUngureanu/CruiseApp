package com.sda.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@Controller
public class LoginController {
    @GetMapping("/login")
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView("main_page/login");
        return modelAndView;
    }

    @RequestMapping(value = "/username", method = RequestMethod.GET)
    public String currentUsername(HttpServletRequest request) {
        Principal principal = request.getUserPrincipal();
        return principal.getName();
    }

}
