package com.springboot.auth.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter(AccessLevel.PUBLIC)
@Setter
public class UserCredentials {
    private String username, password;
}