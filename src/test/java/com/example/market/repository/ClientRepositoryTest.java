package com.example.market.repository;

import com.example.market.entity.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ClientRepositoryTest {

    @Autowired
    ClientRepository repository;

    @Test
    public void addClient(){
        Produit produit = Produit.builder()
                .code("123456")
                .title("Pain Complet")
                .description("pain coplet a base du ble ...")
                .prix(3.5)
                .build();

        Produit produit1 = Produit.builder()
                .code("123457")
                .title("Lait")
                .description("1/2 L de Lait")
                .prix(5.5)
                .build();

        Produit produit2 = Produit.builder()
                .code("123458")
                .title("Eau Minerale")
                .description("1/2 L d'eau minerale")
                .prix(7.5)
                .build();


        ProduitDemande produitDemande = ProduitDemande.builder()
                .produit(produit)
                .quantite(5)
                .build();
        ProduitDemande produitDemande1 = ProduitDemande.builder()
                .produit(produit1)
                .quantite(3)
                .build();
        ProduitDemande produitDemande2 = ProduitDemande.builder()
                .produit(produit2)
                .quantite(7)
                .build();

        Demande demande = Demande.builder()
                .title("demande de pain complet")
                .description("demande de pain complet")
                .status(Status.PENDING)
                .produitDemandes(List.of(produitDemande))
                .build();

        Demande demande1 = Demande.builder()
                .title("demande de Lait")
                .description("demande de Lait")
                .status(Status.PENDING)
                .produitDemandes(List.of(produitDemande1))
                .build();

        Demande demande2 = Demande.builder()
                .title("Eau Minerale")
                .description("demande d'eau Minerale")
                .status(Status.PENDING)
                .produitDemandes(List.of(produitDemande2))
                .build();


        Client c = Client.builder()
                .firstname("Badr")
                .lastname("Ghanbi")
                .email("badr@gmail.com")
                .phone("0678384245")
                .demandes(List.of(demande,demande1,demande2))
                .build();

        repository.save(c);
    }
}