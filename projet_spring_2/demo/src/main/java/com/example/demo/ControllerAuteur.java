package com.example.demo;


import com.example.demo.Entity.Auteur;
import com.example.demo.Service.AuteurInterface;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping(value="auteur")

public class ControllerAuteur {
    @Autowired
    private AuteurInterface Service;

    @PostMapping("/addAuteur")
    public Auteur addAuteur(@RequestBody Auteur e)
    {
        return Service.addAuteur(e);
    }

    @JsonProperty
    @GetMapping("/auteurs")
    public List<Auteur> getAllAuteurs()
    {
        return Service.getAllAuteurs();
    }

    @GetMapping("/{id}")
    public Auteur getAuteurById(@PathVariable Long id)
    {
        return Service.getAuteur(id);
    }

    @PutMapping("/updateAuteur")
    public Auteur updateAuteur(@RequestBody Auteur p)
    {
        return Service.updateAuteur(p);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Auteur> deleteAuteur(@PathVariable long id)
    {
        return Service.deleteAuteur(id);
    }
}
