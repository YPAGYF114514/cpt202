package com.cpt202.team.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cpt202.team.models.Team;
import com.cpt202.team.repositories.TeamRepo;
import java.util.List;

@Service
public class TeamService {
    @Autowired
    private TeamRepo teamRepo;

    public Team newTeam(Team team){
        return teamRepo.save(team);
    }

    public List<Team> getTeamList(){
        return teamRepo.findAll();
    }
}
