package com.abhinav.Soul_Boggling.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

}
