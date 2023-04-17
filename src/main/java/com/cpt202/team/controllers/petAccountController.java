package com.cpt202.team.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;
//import com.cpt202.team.models.Team;
import com.cpt202.team.models.petAccount;
//import com.cpt202.team.services.TeamService;
import com.cpt202.team.services.petAccountService;


//Spring Anotation
@Controller
@RequestMapping("/account")
public class petAccountController {
    @Autowired
    private petAccountService petAccountService;

    // localhost:8080/team/list
    @GetMapping("/list")
    public String getList(Model model){
        model.addAttribute("AccountList", petAccountService.getAccountList());
        return "allTeams";
    }

    @GetMapping("/add")
    public String addAccount(Model model){
        model.addAttribute("petAccount", new petAccount());
        return "Register";
    }
    @GetMapping("/login")
    public String logIn(Model model){
        model.addAttribute("petAccount", new petAccount());
        return "logInPage";
    }

    @PostMapping("/add")
    public String confirmNewTeam(@ModelAttribute("petAccount") petAccount account){
        petAccountService.newAccount(account);

        return "home";
    }
}
