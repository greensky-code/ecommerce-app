package com.store.productcatalogue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.store.productcatalogue.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
