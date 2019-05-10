package com.springboot.auth.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter(AccessLevel.PUBLIC)
@Setter
public class AppUser {
    private Integer id;
    private String username, password;
    private String role;

    public AppUser(Integer id, String username, String password, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
    }
}