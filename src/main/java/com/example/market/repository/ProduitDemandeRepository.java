package com.example.market.repository;

import com.example.market.entity.ProduitDemande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitDemandeRepository extends JpaRepository<ProduitDemande, Long> {
}
