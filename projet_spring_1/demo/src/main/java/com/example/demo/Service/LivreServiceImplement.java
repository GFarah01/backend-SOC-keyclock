package com.example.demo.Service;

import com.example.demo.Entity.Livre;
import com.example.demo.Repository.RepositoryLivre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivreServiceImplement implements LivreInterface {

     @Autowired
    RepositoryLivre repo;

    public  List<Livre> getAllLivres(){
        return repo.findAll();
    }

    public Livre addLivre(Livre l){
        return repo.save(l);
    }

    public Livre getLivre(long id) {return repo.findById(id).orElse(null);}

    public ResponseEntity<Livre> deleteLivre(long id) {
        repo.deleteById(id);
        return new ResponseEntity< Livre>(HttpStatus.OK);
    }
    public Livre updateLivre(Livre l){
        Livre livre = repo.findById(l.getIsbn()).orElse(null);
        livre.setIntitule(l.getIntitule());
        livre.setNbrPage(l.getNbrPage());
        livre.setNomAuteur(l.getNomAuteur());
        return repo.save(livre);
    }
}
