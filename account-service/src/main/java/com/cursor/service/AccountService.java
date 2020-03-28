package com.cursor.service;

import com.cursor.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {

    List<Account> accounts = new ArrayList<>();

    @Autowired
    public void fillListOfAccounts(){
        accounts.add(new Account("1", "Kolia", "Brat", "Springfield", "Male", "kolian322"));
        accounts.add(new Account("2", "Vitia", "Nebrat", "Springfield", "Female", "vitian228"));
    }



    public List<Account> getAllProfiles() {
        return accounts;
    }
}
