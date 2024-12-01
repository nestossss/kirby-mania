package com.kirby.kirbymania.repositories;

import com.kirby.kirbymania.model.OrderItem;
import org.springframework.data.repository.CrudRepository;

public interface OrderItemRepository extends CrudRepository<OrderItem, Integer> {
}
