package com.kirby.kirbymania.repositories;

import com.kirby.kirbymania.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    public List<Product> findProductsByName(String name);
}
