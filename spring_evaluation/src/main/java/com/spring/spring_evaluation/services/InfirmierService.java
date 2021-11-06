package com.spring.spring_evaluation.services;

import com.spring.spring_evaluation.models.Infirmier;

import java.util.List;
import java.util.Optional;

public interface InfirmierService {
    public List<Infirmier> findAll();
    public Optional<Infirmier> findById(Long id_infirmier);
    public Infirmier create(Infirmier infirmier);
    public Infirmier update(Infirmier infirmier);
    public void delete(Long id_infirmier);
}
