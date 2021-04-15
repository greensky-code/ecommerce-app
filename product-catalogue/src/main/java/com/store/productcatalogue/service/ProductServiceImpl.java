package com.store.productcatalogue.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.store.productcatalogue.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	//ProductRepository productRepo;
	List<Product> ProdList = new ArrayList<>();
	
	@Override
	public List<Product> products() {
		return ProdList;
		//return productRepo.findAll();
	}

	@Override
	public Product product(Product product) {
		if(product.getId()!=null) {
			ProdList.remove(product);
			ProdList.add(product);
		} else {
			product.setId(new Random().nextInt());
			ProdList.add(product);
		}
		return product;
		//return productRepo.save(product);

	}

}
