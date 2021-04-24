package com.store.productcatalogue.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.store.productcatalogue.model.OrderResponse;
import com.store.productcatalogue.model.Orders;
import com.store.productcatalogue.model.Product;
/**
 * @Author
 * Dhruv Shah
 */
public interface ProductService {

	List<Product> products();
	
	Product product(Product product);


	public void createOrder(Orders order);
	public OrderResponse Orders();
	public void deleteOrders();
	public Map<Date, OrderResponse> orderHistory();
	public void transaction();

	

}
