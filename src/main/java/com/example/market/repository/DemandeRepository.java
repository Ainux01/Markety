package com.example.market.repository;

import com.example.market.entity.Demande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.*;
@Repository
public interface DemandeRepository extends JpaRepository<Demande, Long> {

    @Query(
            value = "select * from demande where client_id= ?1",
            nativeQuery = true
    )
    List<Demande> getAllByClientId(Long id);
}
