package com.example.demo;

import com.example.demo.Entity.Livre;
import com.example.demo.Service.LivreInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(value="api/livre")
public class LivreController {

    @Autowired
    private LivreInterface Service;

    @PostMapping("/addLivre")
    public Livre addLivre(@RequestBody Livre l)
    {
        return Service.addLivre(l);
    }

    @GetMapping("/livres")
    public List<Livre> getAllLivres()
    {
        return Service.getAllLivres();
    }

    @GetMapping("/{id}")
    public Livre getLivreByISBN(@PathVariable Long id)
    {
        return Service.getLivre(id);
    }

    @PutMapping("/updateLivre")
    public Livre updateLivre(@RequestBody Livre p)
    {
        return Service.updateLivre(p);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Livre> deleteLivre(@PathVariable long id)
    {
        return Service.deleteLivre(id);
    }
}
