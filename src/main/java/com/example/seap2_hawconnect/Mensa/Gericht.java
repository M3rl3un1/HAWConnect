package com.example.seap2_hawconnect.Mensa;

import com.example.seap2_hawconnect.Mensa.Enums.Allergen;
import com.example.seap2_hawconnect.Mensa.Enums.Ernaehrungstyp;
import com.example.seap2_hawconnect.Mensa.Enums.Wochentag;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
@Entity
public class Gericht {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private List<Allergen> allergene;
    @Column
    private Ernaehrungstyp ernaehrungstyp;
    @Column
    private double preis;
    @Column
    private String nameGericht;
    @Column
    private List<Wochentag> angebotAnTag;

    public Gericht(String nameGericht, double preis, List<Allergen> allergene, Ernaehrungstyp ernaehrungstyp, List<Wochentag> angebotAnTag) {
        this.allergene = allergene;
        this.ernaehrungstyp = ernaehrungstyp;
        this.preis = preis;
        this.nameGericht = nameGericht;
        this.angebotAnTag = angebotAnTag;
    }
}
