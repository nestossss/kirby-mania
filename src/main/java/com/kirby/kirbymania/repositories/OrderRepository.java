package com.kirby.kirbymania.repositories;

import com.kirby.kirbymania.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer> {
}
