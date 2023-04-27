package com.example.seap2_hawconnect.Mensa;

import com.example.seap2_hawconnect.Mensa.Enums.Wochentag;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MensaService {
    @Autowired
    MensaRepository mensaRepository;

    public Gericht addGericht(Gericht gericht){return mensaRepository.save(gericht);}
    public void remove(long id){mensaRepository.deleteById(id);}
    public Gericht getGerichtByID(long id){
        return mensaRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
    //nochmal angucken
    public List<Gericht> getGerichteAnTag(Wochentag wochentag){
        return mensaRepository.findAll();
    }

}
