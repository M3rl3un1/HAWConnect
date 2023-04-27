package com.example.seap2_hawconnect.Kalender;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class Termin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long terminID;
}
