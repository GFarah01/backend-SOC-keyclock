package com.example.demo.Service;


import com.example.demo.Entity.Auteur;
import com.example.demo.Repository.RepositoryBib;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuteurServiceImplement implements AuteurInterface {

    @Autowired
    RepositoryBib repo;

    public List<Auteur> getAllAuteurs(){
        return repo.findAll();
    }

    public Auteur addAuteur(Auteur l){
        return repo.save(l);
    }

    public Auteur getAuteur(long id) {return repo.findById(id).orElse(null);}

    public ResponseEntity<Auteur> deleteAuteur(long id) {
        repo.deleteById(id);
        return new ResponseEntity< Auteur>(HttpStatus.OK);
    }
    public Auteur updateAuteur(Auteur l){
        Auteur auteur = repo.findById(l.getIdAuteur()).orElse(null);
        auteur.setNom(l.getNom());
        auteur.setPrenom(l.getPrenom());
        auteur.setAge(l.getAge());
        auteur.setDomaine(l.getDomaine());

        return repo.save(auteur);
    }
}
