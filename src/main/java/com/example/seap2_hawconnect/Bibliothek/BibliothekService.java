package com.example.seap2_hawconnect.Bibliothek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class BibliothekService {
    @Autowired
    BibliothekRepository bibliothekRepository;

    public List<Buch> alleBuecher() {
        return bibliothekRepository.findAll();
    }

    public Optional<Buch> findeBuch(Long id) {
        return bibliothekRepository.findById(id);
    }

    public Buch erstelleBuch(Buch buch) {
        return bibliothekRepository.save(buch);
    }

    public Buch aktualisiereBuch(Long id, Buch buch) {
        Optional<Buch> buchOptional = bibliothekRepository.findById(id);
        if (buchOptional.isPresent()) {
            Buch vorhandenesBuch = buchOptional.get();
            vorhandenesBuch.setTitel(buch.getTitel());
            vorhandenesBuch.setAutor(buch.getAutor());
            vorhandenesBuch.setVerlag(buch.getVerlag());
            vorhandenesBuch.setIsbn(buch.getIsbn());
            vorhandenesBuch.setAusleihstatus(buch.getAusleihstatus());
            return bibliothekRepository.save(vorhandenesBuch);
        } else {
            return null;
        }
    }
    public void loescheBuch(Long id) {
        bibliothekRepository.deleteById(id);
    }

    public Buch setzeVerlaengerungsdatum(Long id, LocalDate datum) {
        Optional<Buch> buchOptional = bibliothekRepository.findById(id);
        if (buchOptional.isPresent()) {
            Buch buch = buchOptional.get();
            buch.setVerlaengerungsdatum(datum);
            return bibliothekRepository.save(buch);
        } else {
            return null;
        }
    }

    public Buch setzeRueckgabedatum(Long id, LocalDate datum) {
        Optional<Buch> buchOptional = bibliothekRepository.findById(id);
        if (buchOptional.isPresent()) {
            Buch buch = buchOptional.get();
            buch.setRueckgabedatum(datum);
            return bibliothekRepository.save(buch);
        } else {
            return null;
        }
    }

    public LocalDate getVerlaengerungsdatum(Long id) {
        Optional<Buch> buchOptional = bibliothekRepository.findById(id);
        if (buchOptional.isPresent()) {
            return buchOptional.get().getVerlaengerungsdatum();
        } else {
            return null;
        }
    }

    public LocalDate getRueckgabedatum(Long id) {
        Optional<Buch> buchOptional = bibliothekRepository.findById(id);
        if (buchOptional.isPresent()) {
            return buchOptional.get().getRueckgabedatum();
        } else {
            return null;
        }
    }
}
