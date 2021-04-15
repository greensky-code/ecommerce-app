package com.store.productcatalogue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.store.productcatalogue.model.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer> {

}
