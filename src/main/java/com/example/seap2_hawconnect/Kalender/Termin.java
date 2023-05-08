package com.example.seap2_hawconnect.Kalender;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@Data
@Entity
public class Termin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long terminID;

    @Column
    private LocalDate dateTime;

}
