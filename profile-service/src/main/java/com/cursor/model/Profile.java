package com.cursor.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Profile {

    private String id;
    private String company;
    private String department;
    private String jobTitle;
    private String skill;
    private String username;
}
