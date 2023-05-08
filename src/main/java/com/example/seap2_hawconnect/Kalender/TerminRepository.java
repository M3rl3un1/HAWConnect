package com.example.seap2_hawconnect.Kalender;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerminRepository extends JpaRepository<Termin, String> {

}
