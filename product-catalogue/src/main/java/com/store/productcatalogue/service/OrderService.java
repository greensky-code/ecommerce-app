package com.store.productcatalogue.service;

import java.util.Date;
import java.util.Map;

import com.store.productcatalogue.model.OrderResponse;
import com.store.productcatalogue.model.Orders;

public interface OrderService {

	public void createOrder(Orders order);
	public OrderResponse Orders();
	public void deleteOrders();
	public Map<Date, OrderResponse> orderHistory();
	public void transaction();

	
}
