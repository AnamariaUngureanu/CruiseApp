package com.sda.spring.controllers;

import com.sda.spring.models.ShipsModel;
import com.sda.spring.repositories.ShipsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class ShipsController {
    private static final Logger logger =  LoggerFactory.getLogger(ShipsController.class);
    @Autowired
    private ShipsRepository shipsRepository;


    public ShipsController() {
        logger.info(getClass().getSimpleName() + " created");
    }

//    @GetMapping("/ships")
//    public ModelAndView getShipsPage() {
//        ModelAndView modelAndView = new ModelAndView("ships");
//        modelAndView.addObject("shipsList", shipsRepository.findAll());
//        return modelAndView;
//    }

    @GetMapping("/ships/add")
    public ModelAndView addNewShip() {
        ModelAndView modelAndView = new ModelAndView("homepage");
        modelAndView.addObject("ship", new ShipsModel());

        return modelAndView;
    }
//
//    @GetMapping("ships/edit/{id}") {
//
//    }
//
//    @PostMapping("ships/save") {
//
//    }
//
//    @GetMapping("ships/delete/{id}") {
//
//    }
    @GetMapping("/ships")
    public ModelAndView allureView(){
        ModelAndView modelAndView =new ModelAndView("secondary_pages/ships/ships");
        return modelAndView;
    }
}
