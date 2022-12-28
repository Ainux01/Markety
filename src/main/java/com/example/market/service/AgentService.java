package com.example.market.service;

import com.example.market.entity.Client;
import com.example.market.entity.Demande;
import com.example.market.repository.ClientRepository;
import com.example.market.repository.DemandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class AgentService {
    @Autowired
    ClientRepository clientRepository;

    @Autowired
    DemandeRepository demandeRepository;

    public Client getClientById(Long id){
        return clientRepository.findById(id).get();
    }
    public List<Client> getAllClients(){
        return clientRepository.findAll();
    }

//    public List<Demande> getDemandesByClient(Long id);

}
