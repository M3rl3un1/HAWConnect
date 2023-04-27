package com.example.seap2_hawconnect.Bibliothek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController("/")
public class BibliothekController {
    @Autowired
    BibliothekRepository bibliothekRepository;
    @Autowired
    StandortRepository standortRepository;

    @GetMapping("TestBibliothek")
    public List<Buch> buchListe() {
        return bibliothekRepository.findAll();
    }
    @GetMapping("Bibliothekstandort")
    public List<Standort> standortListe() {
        return standortRepository.findAll();
    }
}
