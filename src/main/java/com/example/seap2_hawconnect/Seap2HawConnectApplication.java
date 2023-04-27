package com.example.seap2_hawconnect;

import com.example.seap2_hawconnect.Bibliothek.*;
import com.example.seap2_hawconnect.Mensa.*;
import com.example.seap2_hawconnect.Mensa.Enums.Allergen;
import com.example.seap2_hawconnect.Mensa.Enums.Ernaehrungstyp;
import com.example.seap2_hawconnect.Mensa.Enums.Wochentag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Seap2HawConnectApplication implements CommandLineRunner {

    @Autowired
    BibliothekRepository bibliothekRepository;
    @Autowired
    StandortRepository standortRepository;
    @Autowired
    MensaRepository mensaRepository;

    public static void main(String[] args) {
        SpringApplication.run(Seap2HawConnectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       bibliothekRepository.save(new Buch("Testtitel","Testautor","Testverlag","ISBN19383939git 3", Status.VERFUEGBAR));
       standortRepository.save(new Standort("HAW BT5", "Berliner Tor 5","10.95","Mo-Fr: 08:00 - 17:00"));
       standortRepository.save(new Standort("HAW BT7", "Berliner Tor 7","13.21","Mo-Fr: 08:00 - 18:00"));
       List<Allergen> allergene = new ArrayList<>();
       allergene.add(Allergen.NUESSE);
       allergene.add(Allergen.GETREIDE);
       List<Wochentag> wochentage = new ArrayList<>();
       wochentage.add(Wochentag.DIENSTAG);
       mensaRepository.save(new Gericht("Pasta",4.0,allergene, Ernaehrungstyp.VEGAN,wochentage));

    }
}
