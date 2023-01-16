package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor

public class Livre implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE) //GenerationType.TABLE est utilisé avec l'heritage
    private long isbn;

    @Column(name = "intitule")
    private String intitule;

    @Column(name = "nomAuteur")
    private String nomAuteur;

    @Column(name = "nbrPage")
    private int nbrPage;
}
