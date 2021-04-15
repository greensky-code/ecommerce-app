package com.store.productcatalogue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.store.productcatalogue.model.Login;
import com.store.productcatalogue.model.OrderResponse;
import com.store.productcatalogue.model.Orders;
import com.store.productcatalogue.model.Product;
import com.store.productcatalogue.model.ResponseDto;
import com.store.productcatalogue.service.LoginService;
import com.store.productcatalogue.service.OrderService;
import com.store.productcatalogue.service.ProductService;

@RestController
public class CatalogueController {

	@Autowired
	private ProductService productService;

	@Autowired
	private LoginService loginService;

	@Autowired
	private OrderService orderService;


	@PostMapping(value = "/login")
	ResponseEntity<ResponseDto<Login>> loginUser(@RequestBody Login login){
		Login details = loginService.loginUser(login);
		if(details != null)
			return ResponseEntity.ok(new ResponseDto(HttpStatus.OK, details)); 
		return ResponseEntity.ok(new ResponseDto(HttpStatus.NOT_FOUND, null));
	}

	@PostMapping(value = "/add-product")
	ResponseEntity<ResponseDto<Product>> createProduct(@RequestBody Product product){
		Product prod = productService.product(product);
		if (product != null)
			return ResponseEntity.ok(new ResponseDto(HttpStatus.CREATED, prod)); 
		return ResponseEntity.ok(new ResponseDto(HttpStatus.NOT_FOUND, null));
	}

	@GetMapping(value = "/products")
	ResponseEntity<ResponseDto<List<Product>>> getProducts(){
		List<Product> list = productService.products();
		if (!CollectionUtils.isEmpty(list))
			return ResponseEntity.ok(new ResponseDto(HttpStatus.OK, list)); 
		return ResponseEntity.ok(new ResponseDto(HttpStatus.NOT_FOUND, null));
	}


	@PutMapping(value = "/update-product")
	ResponseEntity<ResponseDto<Product>> updateProduct(@RequestBody Product product){
		Product prod = productService.product(product);
		if (product != null)
			return ResponseEntity.ok(new ResponseDto(HttpStatus.OK, prod)); 
		return ResponseEntity.ok(new ResponseDto(HttpStatus.NOT_FOUND, null));
	}

	@PostMapping(value = "/add-order")
	void createOrder(@RequestBody Orders order){
		orderService.createOrder(order);
	}

	@GetMapping(value = "/orders")
	ResponseEntity<ResponseDto<List<OrderResponse>>> getOrders(){
		OrderResponse list = orderService.Orders();
		if (list != null)
			return ResponseEntity.ok(new ResponseDto(HttpStatus.OK, list)); 
		return ResponseEntity.ok(new ResponseDto(HttpStatus.NOT_FOUND, null));
	}
	
	@DeleteMapping(value = "/orders")
	void deleteOrders(){
		orderService.Orders();
	}

}