package com.example.seap2_hawconnect.Kurse;

import org.springframework.data.jpa.repository.JpaRepository;

public interface KursRepository extends JpaRepository<Modul,Long> {

    public Object findByModulID(Long id);
    public Object findByPraktikumsgruppeAndModulname(Integer praktikumsgruppe, String modulname);
}
