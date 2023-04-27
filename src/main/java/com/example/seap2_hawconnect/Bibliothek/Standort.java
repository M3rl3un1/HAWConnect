package com.example.seap2_hawconnect.Bibliothek;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class Standort {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long StandortID;

    @Column(name = "name")
    private String name;
    @Column(name = "adresse")
    private String adresse;
    @Column(name = "raumnummer")
    private String raumnummer;
    @Column(name = "oeffnungszeit")
    private String oeffnungszeit;

    public Standort(String name, String adresse,String raumnummer, String oeffnungszeit) {
        this.name = name;
        this.adresse = adresse;
        this.raumnummer = raumnummer;
        this.oeffnungszeit = oeffnungszeit;
    }
}
