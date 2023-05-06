package com.example.seap2_hawconnect.Mensa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@CrossOrigin("https://localhost:3000")
@RestController("/Mensa")
public class MensaController {
    @Autowired
    MensaRepository mensaRepository;
    @GetMapping("Gericht")
    public List<Gericht> gerichtListe() {
        return mensaRepository.findAll();
    }
}

