package com.example.market.controller;

import com.example.market.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demande")
public class DemandeController {
    @Autowired
    AgentService agentService;

}
