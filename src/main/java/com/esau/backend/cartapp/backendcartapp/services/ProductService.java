package com.esau.backend.cartapp.backendcartapp.services;

import java.util.List;

import com.esau.backend.cartapp.backendcartapp.models.entities.Product;

public interface ProductService {

    List<Product> findAll();

    
}
