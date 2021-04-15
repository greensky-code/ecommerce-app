package com.store.productcatalogue.service;

import java.util.List;

import com.store.productcatalogue.model.Product;

public interface ProductService {

	List<Product> products();
	
	Product product(Product product);
}
