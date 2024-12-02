package com.kirby.kirbymania.controller;


import com.kirby.kirbymania.model.Product;
import com.kirby.kirbymania.repositories.ProductRepository;
import com.kirby.kirbymania.util.CategoriaProduto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/")
    public String homePage(){
        return "index";
    }

    @GetMapping("/admin")
    public String adminPage(){
        return "admin";
    }

    @GetMapping("/categories")
    public String categoriesPage(){
        return "caminhos";
    }

    @GetMapping("/categories/{category}")
    public String specificCategoriePage(@PathVariable String category, Model model){
        System.out.println(category.toUpperCase().trim());
        CategoriaProduto prodCategoria = CategoriaProduto.valueOf( (category.toUpperCase()) );
        List<Product> produtos = productRepository.findByCategoria(prodCategoria);
        model.addAttribute("listaProdutos", produtos);
        model.addAttribute("categoria", prodCategoria);
        return "loja";
    }

}
