package com.example.feignservice;

import com.example.feignservice.Beans.Auteur;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class Livre {
    private long isbn;
    private int nbrPage;
    private String intitule;

}
