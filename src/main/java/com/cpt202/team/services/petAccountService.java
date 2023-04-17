package com.cpt202.team.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import com.cpt202.team.models.Team;
import com.cpt202.team.models.petAccount;
import com.cpt202.team.repositories.PetAccountRepo;
import java.util.List;

@Service
public class petAccountService {
    @Autowired
    private PetAccountRepo accRepo;

    public petAccount newAccount(petAccount acc){
        return accRepo.save(acc);
    }

    public List<petAccount> getAccountList(){
        return accRepo.findAll();
    }
}
