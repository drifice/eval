package com.spring.spring_evaluation.controllers;

import com.spring.spring_evaluation.models.Patient;
import com.spring.spring_evaluation.services.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/patients")
public class PatientController {
    private PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("all")
    public List<Patient> findAll() {
        return this.patientService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Patient> findById(@PathVariable Long id) {
        return this.patientService.findById(id);
    }

    @GetMapping
    public Optional<List<Patient>> findByNomAndPrenom(@RequestParam("nom") String nom, @RequestParam("prenom") String prenom) {
        return this.patientService.findPatientByNomAndByPrenom(nom, prenom);
    }

    @PostMapping
    @ResponseBody
    public Patient send(@RequestBody Patient patient) {
        return this.patientService.create(patient);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        this.patientService.delete(id);
    }

}