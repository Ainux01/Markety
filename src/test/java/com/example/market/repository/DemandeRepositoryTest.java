package com.example.market.repository;

import com.example.market.entity.Demande;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DemandeRepositoryTest {

    @Autowired
    DemandeRepository repository;

    @Test
    public void printFindAllByClientId(){
        List<Demande> ds = repository.getAllByClientId(2L);
        System.out.println(ds);
    }

}