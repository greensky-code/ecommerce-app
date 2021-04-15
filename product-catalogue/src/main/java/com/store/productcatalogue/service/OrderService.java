package com.store.productcatalogue.service;

import com.store.productcatalogue.model.OrderResponse;
import com.store.productcatalogue.model.Orders;

public interface OrderService {

	public void createOrder(Orders order);
	public OrderResponse Orders();
	public void deleteOrders();
}
