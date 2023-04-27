package com.example.seap2_hawconnect.Bibliothek;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class Buch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long BuchID;

    @Column(name = "titel")
    private String titel;
    @Column(name = "autor")
    private String autor;
    @Column(name = "verlag")
    private String verlag;
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "ausleihstatus")
    private Status ausleihstatus;



    public Buch(String titel, String autor, String verlag, String isbn, Status ausleihstatus) {
        this.titel = titel;
        this.autor = autor;
        this.verlag = verlag;
        this.isbn = isbn;
        this.ausleihstatus = ausleihstatus;

    }
}
