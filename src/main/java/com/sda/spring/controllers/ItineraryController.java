package com.sda.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ItineraryController {

    @GetMapping("/itinerary")
    public ModelAndView getItineraries(){
        ModelAndView modelAndView = new ModelAndView("secondary_pages/itineraries/itineraries");
        return modelAndView;
    }
}
