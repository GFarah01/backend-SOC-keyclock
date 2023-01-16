package com.example.demo.Repository;

import com.example.demo.Entity.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryLivre extends JpaRepository <Livre, Long> {
}
