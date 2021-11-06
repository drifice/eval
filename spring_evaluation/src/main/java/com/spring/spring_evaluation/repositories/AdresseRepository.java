package com.spring.spring_evaluation.repositories;

import com.spring.spring_evaluation.models.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AdresseRepository extends JpaRepository<Adresse, Long> {
    @Query("SELECT ad FROM Adresse ad WHERE ad.ville = :ville")
    public Optional<List<Adresse>> findByVille(@Param("ville") String ville);
}
