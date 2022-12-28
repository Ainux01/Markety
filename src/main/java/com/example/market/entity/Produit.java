package com.example.market.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.*;
import org.springframework.validation.annotation.Validated;
import java.util.*;
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long produitId;
    private String code;
    private String title;
    private String description;
    private Double prix;



}
