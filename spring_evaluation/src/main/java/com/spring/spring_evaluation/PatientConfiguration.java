package com.spring.spring_evaluation;

import com.spring.spring_evaluation.models.Adresse;
import com.spring.spring_evaluation.repositories.AdresseRepository;
import com.spring.spring_evaluation.repositories.InfirmierRepository;
import com.spring.spring_evaluation.repositories.PatientRepository;
import com.spring.spring_evaluation.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PatientConfiguration {

    @Bean
    public PatientService patientService(PatientRepository patientRepository) {
        return new PatientServiceImpl(patientRepository);
    }

    @Bean
    public InfirmierService infirmierService(InfirmierRepository infirmierRepository) {
        return new InfirmierServiceImpl(infirmierRepository);
    }

    @Bean
    public AdresseService adresseService(AdresseRepository adresseRepository) {
        return new AdresseServiceImpl(adresseRepository);
    }
}
