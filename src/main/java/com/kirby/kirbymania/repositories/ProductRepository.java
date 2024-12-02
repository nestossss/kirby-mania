package com.kirby.kirbymania.repositories;

import com.kirby.kirbymania.model.Product;
import com.kirby.kirbymania.util.CategoriaProduto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    public List<Product> findByCategoria(CategoriaProduto categoria);
}
