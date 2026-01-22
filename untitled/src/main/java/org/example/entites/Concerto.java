package org.example.entites;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Concerto extends Evento{

    @Enumerated(EnumType.STRING)
    private Genere genere;

    private boolean inStreaming;

    public Concerto(){}

    public Concerto(String titolo,
                    LocalDate dataEvento,
                    String descrizione,
                    TipoEvento tipoEvento,
                    int numeroPartecipanti,
                    Genere genere,
                    boolean inStreaming
                    ){
        this.genere=genere;
        this.inStreaming=inStreaming;
    }
}
