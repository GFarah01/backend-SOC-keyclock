package com.example.feignservice.Beans;

import com.example.feignservice.Livre;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
public class Auteur {
    private long idAuteur;
    private String nom;
    private String prenom;
    private int age ;
    private String domaine;
}
