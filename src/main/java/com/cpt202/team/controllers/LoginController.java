package com.cpt202.team.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;;

@Controller
public class LoginController {

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("petAccount", "Thomas");
        return "home";
    }
}
