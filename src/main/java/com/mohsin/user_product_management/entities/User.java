package com.mohsin.user_product_management.entities;

import jakarta.persistence.*;
import lombok.Data;


import java.time.LocalDate;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String email;
    private String phone;
    private LocalDate dob;
    private String password;


}
