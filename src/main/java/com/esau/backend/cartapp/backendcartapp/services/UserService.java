package com.esau.backend.cartapp.backendcartapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.esau.backend.cartapp.backendcartapp.models.entities.User;

@Service
public interface UserService{

    List<User> findAll();

    Optional<User> findById(Long id);

    User save(User user);

    void deleteById(Long id);
}
