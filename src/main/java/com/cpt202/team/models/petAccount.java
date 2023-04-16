package com.cpt202.team.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class petAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String phoneNumber;
    private String password; // member_count

    public petAccount() {
    }

    public petAccount(int id, String phoneNumber, String password) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return phoneNumber;
    }
    public void setName(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getMemberCount() {
        return password;
    }
    public void setMemberCount(String password) {
        this.password = password;
    }    
}
