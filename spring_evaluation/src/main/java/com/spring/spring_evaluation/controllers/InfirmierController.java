package com.spring.spring_evaluation.controllers;

import com.spring.spring_evaluation.models.Infirmier;
import com.spring.spring_evaluation.services.InfirmierService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/infirmiers")
public class InfirmierController {
    private InfirmierService infirmierService;

    public InfirmierController(InfirmierService infirmierService) {
        this.infirmierService = infirmierService;
    }

    @GetMapping
    public List<Infirmier> findAll() {
        return this.infirmierService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Infirmier> findById(@PathVariable Long id) {
        return this.infirmierService.findById(id);
    }

    @PostMapping
    @ResponseBody
    public Infirmier send(@RequestBody Infirmier infirmier) {
        return this.infirmierService.create(infirmier);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.infirmierService.delete(id);
    }
}
