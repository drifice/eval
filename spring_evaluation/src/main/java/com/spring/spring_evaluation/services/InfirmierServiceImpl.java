package com.spring.spring_evaluation.services;

import com.spring.spring_evaluation.models.Infirmier;
import com.spring.spring_evaluation.repositories.InfirmierRepository;

import java.util.List;
import java.util.Optional;

public class InfirmierServiceImpl implements InfirmierService{
    private InfirmierRepository infirmierRepository;

    public InfirmierServiceImpl(InfirmierRepository infirmierRepository) {
        this.infirmierRepository = infirmierRepository;
    }

    public List<Infirmier> findAll() {
        return this.infirmierRepository.findAll();
    }

    public Optional<Infirmier> findById(Long id_infirmier) {
        return this.infirmierRepository.findById(id_infirmier);
    }

    public Infirmier create(Infirmier infirmier) {
        return this.infirmierRepository.save(infirmier);
    }

    public Infirmier update(Infirmier infirmier) {
        return this.infirmierRepository.save(infirmier);
    }

    public void delete(Long id_infirmier) {
        this.infirmierRepository.deleteById(id_infirmier);
    }
}
