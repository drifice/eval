package com.spring.spring_evaluation.services;

import com.spring.spring_evaluation.models.Adresse;
import com.spring.spring_evaluation.repositories.AdresseRepository;

import java.util.List;
import java.util.Optional;

public class AdresseServiceImpl  implements AdresseService{
    private AdresseRepository adresseRepository;

    public AdresseServiceImpl(AdresseRepository adresseRepository) {
        this.adresseRepository = adresseRepository;
    }

    public List<Adresse> findAll() {
        return this.adresseRepository.findAll();
    }

    public Optional<Adresse> findById(Long id_adresse) {
        return this.adresseRepository.findById(id_adresse);
    }

    public Optional<List<Adresse>> findByVille(String ville) {
        return this.adresseRepository.findByVille(ville);
    }

    public Adresse create(Adresse adresse) {
        return this.adresseRepository.save(adresse);
    }

    public Adresse update(Adresse adresse) {
        return this.adresseRepository.save(adresse);
    }
}
