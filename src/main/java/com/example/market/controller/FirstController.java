package com.example.market.controller;

import com.example.market.entity.Client;
import com.example.market.entity.Demande;
import com.example.market.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
@RequestMapping("/client")
public class FirstController {

    @Autowired
    AgentService agentService;

    @GetMapping("/")
    public List<Client> getAllClients(){
        return agentService.getAllClients();
    }

    @GetMapping("/{id}")
    public Client getClient(@PathVariable Long id){
        return agentService.getClientById(id);
    }


//    public List<Demande> getDemandesByClient(Long id){
//
//    }


}
