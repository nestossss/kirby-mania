package com.kirby.kirbymania.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/products")
public class ProductController {

    @PostMapping("/delete-product")
    public @ResponseBody  String deleteProduct(){
        return "deletado com sucesso";
    }


    @PostMapping("/add-product")
    public @ResponseBody String addProduct(){
        return "adicionado com sucesso";
    }

}
