package com.mycompany.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}
