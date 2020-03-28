package com.cursor.controller;

import com.cursor.feign.AccountClient;
import com.cursor.model.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    private final AccountClient accountClient;

    public ProfileController(AccountClient accountClient) {
        this.accountClient = accountClient;
    }


    @GetMapping("/all")
    public List<Profile> getProfiles() {
        return accountClient.getAllProfiles();
    }
}
