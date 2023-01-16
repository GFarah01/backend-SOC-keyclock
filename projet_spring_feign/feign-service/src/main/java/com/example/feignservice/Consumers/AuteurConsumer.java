package com.example.feignservice.Consumers;

import com.example.feignservice.Beans.Auteur;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="bib-micro")
public interface AuteurConsumer {
    @PostMapping("/auteur/addAuteur")
    public Auteur addAuteur(@RequestBody Auteur e);

    @JsonProperty
    @GetMapping("/auteur/auteurs")
    public List<Auteur> getAllAuteurs();

    @GetMapping("/auteur/{id}")
    public Auteur getAuteurById(@PathVariable Long id);

    @PutMapping("/auteur/updateAuteur")
    public Auteur updateAuteur(@RequestBody Auteur p);

    @DeleteMapping("/auteur/delete/{id}")
    public ResponseEntity<Auteur> deleteAuteur(@PathVariable long id);

}
