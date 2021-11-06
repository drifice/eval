package com.spring.spring_evaluation.controllers;

import com.spring.spring_evaluation.models.Adresse;
import com.spring.spring_evaluation.models.Infirmier;
import com.spring.spring_evaluation.services.AdresseService;
import com.spring.spring_evaluation.services.InfirmierService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/adresses")
public class AdresseController {
    private AdresseService adresseService;

    public AdresseController(AdresseService adresseService) {
        this.adresseService = adresseService;
    }

    @GetMapping("/adresses/all")
    public List<Adresse> findAll() {
        return this.adresseService.findAll();
    }

    @GetMapping("/adresses")
    public Optional<List<Adresse>> findByVille(@RequestParam("ville") String ville) {
        return this.adresseService.findByVille(ville);
    }

    @GetMapping("/adresses/{id}")
    public Optional<Adresse> findById(@PathVariable Long id) {
        return this.adresseService.findById(id);
    }

    @PostMapping("/adresses")
    @ResponseBody
    public Adresse send(@RequestBody Adresse adresse) {
        return this.adresseService.create(adresse);
    }

}
