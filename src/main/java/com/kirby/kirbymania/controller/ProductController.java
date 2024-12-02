package com.kirby.kirbymania.controller;

import com.kirby.kirbymania.model.Product;
import com.kirby.kirbymania.repositories.ProductRepository;
import com.kirby.kirbymania.util.CategoriaProduto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @PostMapping("/delete-product")
    public String deleteProduct(@RequestParam String productCategory, @RequestParam String productId){
        productRepository.deleteById(Integer.parseInt(productId));
        return "redirect:/categories/"+ productCategory.toLowerCase();
    }


    @PostMapping("/add-product")
    public String addProduct(@RequestParam String productName, @RequestParam Float productPrice, @RequestParam String productCategory){
        Product novoProduto = new Product();
        novoProduto.setCategoria(CategoriaProduto.valueOf(productCategory.toUpperCase().trim()));
        novoProduto.setNome(productName);
        novoProduto.setPrice(productPrice);

        System.out.println("Prodto adicionado");
        System.out.println("Nome do produto: "+ novoProduto.getNome());
        productRepository.save(novoProduto);
        return "redirect:/admin";
    }

}
