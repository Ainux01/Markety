package com.example.market.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ProduitDemande {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long produitdemandeId;
    @Min(1)
    private int quantite;

    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )

    @JoinColumn(
            name = "produitdemande_id",
            referencedColumnName = "produitdemandeId"
    )
    private Produit produit;


}
