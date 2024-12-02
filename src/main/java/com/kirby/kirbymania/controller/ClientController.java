package com.kirby.kirbymania.controller;

import com.kirby.kirbymania.model.Order;
import com.kirby.kirbymania.model.Product;
import com.kirby.kirbymania.repositories.OrderItemRepository;
import com.kirby.kirbymania.repositories.OrderRepository;
import com.kirby.kirbymania.repositories.ProductRepository;
import com.kirby.kirbymania.repositories.UserRepository;
import com.kirby.kirbymania.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/")
    public String home(){
        return "auth";
    }

    @GetMapping("/:id")
    public String showProfilePage(@PathVariable Integer id, Model model){
        Optional<User> user = userRepository.findById(id);
        return "profile";
    }

    @GetMapping("/all")
    public String showAllClients(Model model){
        Iterable<User> clients = userRepository.findAll();
        model.addAttribute("clients", clients);
        return "clients";
    }

    @PostMapping("/add-to-cart")
    public @ResponseBody String addToLastOrder(){
        return "Adicionado ao carrinho";
    }


}
