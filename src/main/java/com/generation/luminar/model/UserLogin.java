package com.generation.luminar.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLogin {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String photo;
    private String token;
}
