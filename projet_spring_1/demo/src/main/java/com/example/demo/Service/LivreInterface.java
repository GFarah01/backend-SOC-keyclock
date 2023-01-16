package com.example.demo.Service;

import com.example.demo.Entity.Livre;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface LivreInterface {

    List<Livre> getAllLivres();
    Livre addLivre(Livre l);
    Livre getLivre(long id);
    //Employee getEmployeeByName(String name);
    ResponseEntity<Livre> deleteLivre(long id);
    Livre updateLivre(Livre l);

}
