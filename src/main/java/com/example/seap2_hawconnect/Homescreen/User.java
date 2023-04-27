package com.example.seap2_hawconnect.Homescreen;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long userID;

    private String benutzerkennung;
    private String passwort;


}