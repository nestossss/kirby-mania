package com.kirby.kirbymania.controller;

import com.kirby.kirbymania.repositories.ClientRepository;
import com.kirby.kirbymania.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/")
    public String home(){
        return "hello";
    }

    @GetMapping("/clients")
    public String showAllClients(Model model){
        Iterable<Client> clients = clientRepository.findAll();
        model.addAttribute("clients", clients);
        return "clients";
    }
}
