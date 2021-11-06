package com.spring.spring_evaluation.services;

import com.spring.spring_evaluation.models.Adresse;

import java.util.List;
import java.util.Optional;

public interface AdresseService {
    public List<Adresse> findAll();
    public Optional<Adresse> findById(Long id_adresse);
    public Optional<List<Adresse>> findByVille(String ville);
    public Adresse create(Adresse adresse);
    public Adresse update(Adresse adresse);
}
