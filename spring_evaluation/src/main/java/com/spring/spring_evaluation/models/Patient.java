package com.spring.spring_evaluation.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String sexe;
    private Integer nbSecu;

    @ManyToOne(cascade = CascadeType.ALL)
    private Adresse adresse;

    @ManyToOne(cascade = CascadeType.ALL)
    private Infirmier infirmier;

}
