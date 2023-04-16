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
import com.cpt202.team.models.Team;
import com.cpt202.team.services.TeamService;


//Spring Anotation
@Controller
@RequestMapping("/team")
public class TeamController {
    @Autowired
    private TeamService teamService;

    // localhost:8080/team/list
    @GetMapping("/list")
    public String getList(Model model){
        model.addAttribute("teamList", teamService.getTeamList());
        return "allTeams";
    }

    @GetMapping("/add")
    public String addTeam(Model model){
        model.addAttribute("team", new Team());
        return "addTeam";
    }

    @PostMapping("/add")
    public String confirmNewTeam(@ModelAttribute("team") Team team){
        teamService.newTeam(team);

        return "home";
    }
}
