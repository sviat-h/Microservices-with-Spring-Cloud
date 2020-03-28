package com.cursor.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    private String id;
    private String firstName;
    private String lastName;
    private String city;
    private String gender;
    private String username;
}
