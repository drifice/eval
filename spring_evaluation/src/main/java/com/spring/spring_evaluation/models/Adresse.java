package com.spring.spring_evaluation.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String rue;
    private String ville;
    private Integer cp;

}