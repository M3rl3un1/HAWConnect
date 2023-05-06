package com.example.seap2_hawconnect.Mensa;

import com.example.seap2_hawconnect.Mensa.Enums.Ernaehrungstyp;
import com.example.seap2_hawconnect.Mensa.Enums.Wochentag;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public interface MensaRepository extends JpaRepository<Gericht, Long> {
    public List<Gericht> findByErnaehrungstypContainingAndAngebotAnTagContaining(Ernaehrungstyp ernaehrungstyp, List<Wochentag> angebotAnTag);

    public List<Gericht> findAll();
}
