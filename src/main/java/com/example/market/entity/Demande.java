package com.example.market.entity;


import jakarta.persistence.*;
import lombok.*;
import java.util.*;
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "produitDemandes" )
public class Demande {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long demandeId;
    private String title;
    private String description;
    @Enumerated(value = EnumType.STRING)
    private Status status;


    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "demande_id",
            referencedColumnName = "demandeId"
    )
    private List<ProduitDemande> produitDemandes;

}
