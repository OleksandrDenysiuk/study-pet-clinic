package com.study.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OwnerController {

    @GetMapping("/owners")
    public String listVets(Model model){
        return "vets/index";
    }
}
