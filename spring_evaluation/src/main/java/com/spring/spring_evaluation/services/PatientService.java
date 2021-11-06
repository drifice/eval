package com.spring.spring_evaluation.services;

import com.spring.spring_evaluation.models.Patient;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public interface PatientService {
    public List<Patient> findAll();
    public Patient save(Patient patient);
    public Optional<Patient> findById(Long id_patient);
    public Optional<List<Patient>> findPatientByNomAndByPrenom(String nom, String prenom);
    public Patient create(Patient patient);
    public Patient update(Patient patient);
    public void delete(Long id_patient);

}
