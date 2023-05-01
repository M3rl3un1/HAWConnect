package com.example.seap2_hawconnect.Homescreen;

import com.example.seap2_hawconnect.Kurse.Modul;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long userID;
    @Column
    private String benutzerkennung;
    @Column
    private String passwort;
    @Column
    private String email;
    @Column
    private String semesteranzahl;
    @OneToMany
    private List<Modul> belegteModule;
    @OneToMany
    private List<Modul> bestandeneModule;

}
