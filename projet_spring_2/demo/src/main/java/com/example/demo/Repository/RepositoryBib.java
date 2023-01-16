package com.example.demo.Repository;

import com.example.demo.Entity.Auteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryBib extends JpaRepository<Auteur, Long> {
}