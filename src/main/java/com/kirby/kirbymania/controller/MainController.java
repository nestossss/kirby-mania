package com.kirby.kirbymania.controller;


import com.kirby.kirbymania.util.CategoriaProduto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping("/")
    public String homePage(){
        return "index";
    }

    @GetMapping("/categories")
    public String categoriesPage(){
        return "caminhos";
    }

    @GetMapping("/categories/{categorie}")
    public String specificCategoriePage(@PathVariable String categorie, Model model){
        model.addAttribute("categoria", categorie);
        return "categoria";
    }

}
