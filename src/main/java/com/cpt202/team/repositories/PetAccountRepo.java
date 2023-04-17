package com.cpt202.team.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
//import com.cpt202.team.models.Team;
import com.cpt202.team.models.petAccount;

public interface PetAccountRepo extends JpaRepository<petAccount, Integer >{
    
}
