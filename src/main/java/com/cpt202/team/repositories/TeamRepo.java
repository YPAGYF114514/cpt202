package com.cpt202.team.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cpt202.team.models.Team;

public interface TeamRepo extends JpaRepository<Team, Integer >{
    
}
