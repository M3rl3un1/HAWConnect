package com.example.seap2_hawconnect.Kurse;

import com.example.seap2_hawconnect.Kalender.Termin;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Entity
public class Modul {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long modulID;

    @Column (name = "modulname")
    private String modulname;
    @Column (name = "dozentenname")
    private Dozent dozentenname;


}
