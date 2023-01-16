package com.example.demo.Service;

import com.example.demo.Entity.Auteur;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AuteurInterface {

    List<Auteur> getAllAuteurs();
    Auteur addAuteur(Auteur l);
    Auteur getAuteur(long id);
    ResponseEntity<Auteur> deleteAuteur(long id);
    Auteur updateAuteur(Auteur l);
}
