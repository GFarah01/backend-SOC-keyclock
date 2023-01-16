package com.example.feignservice.Controllers;


import com.example.feignservice.Beans.Auteur;
import com.example.feignservice.Consumers.AuteurConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "consumer")
@CrossOrigin("*")
public class ControllerLib {
    @Autowired
    AuteurConsumer consumer;

    @GetMapping("/auteurs")
    public List<Auteur> getAllAuteurs(){
        return consumer.getAllAuteurs();
    }

   /* public Auteur addAuteur(Auteur l){
        return consumer.addAuteur(l);
    }

    public Auteur getAuteur(long id) {return consumer.getAuteurById(id);}

    public ResponseEntity<Auteur> deleteAuteur(long id) {
        consumer.deleteAuteur(id);
        return new ResponseEntity<Auteur>(HttpStatus.OK);
    }
    public Auteur updateAuteur(Auteur l){
        Auteur auteur = consumer.getAuteurById(l.getIdAuteur());
        auteur.setNom(l.getNom());
        auteur.setPrenom(l.getPrenom());
        auteur.setAge(l.getAge());
        auteur.setDomaine(l.getDomaine());

        return consumer.addAuteur(auteur);
    }*/

}
