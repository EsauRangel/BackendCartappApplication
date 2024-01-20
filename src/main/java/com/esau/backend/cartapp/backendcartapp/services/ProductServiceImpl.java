package com.esau.backend.cartapp.backendcartapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.esau.backend.cartapp.backendcartapp.models.entities.Product;
import com.esau.backend.cartapp.backendcartapp.repositories.ProductReporsitory;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductReporsitory repository;

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return (List<Product>) repository.findAll();
    }

}
