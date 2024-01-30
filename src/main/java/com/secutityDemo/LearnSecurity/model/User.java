package com.secutityDemo.LearnSecurity.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "table_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private  String username;
    private  String password;

}
