package com.esau.backend.cartapp.backendcartapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esau.backend.cartapp.backendcartapp.models.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
}
