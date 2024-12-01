package com.kirby.kirbymania.repositories;

import com.kirby.kirbymania.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    public User findUserByEmailAndPassword(String email, String password);
}
