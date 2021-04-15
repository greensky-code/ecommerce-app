package com.store.productcatalogue.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.store.productcatalogue.model.OrderResponse;
import com.store.productcatalogue.model.Orders;
import com.store.productcatalogue.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	
	OrderRepository orderRepo;
	List<Orders> orderList = new ArrayList<>();


	@Override
	public void createOrder(Orders order) {
		orderList.add(order);
		//orderRepo.save(order);	
	}

	@Override
	public OrderResponse Orders() {
		double sum = 0.00;
		for(Orders order : orderList) {
			sum+=order.getPrice();
		}
		OrderResponse response = new OrderResponse();
		response.setOrder(orderList);
		response.setTotal(sum);
		return response;//\return orderRepo.findAll();
	}

	@Override
	public void deleteOrders() {
		orderList.clear();
	}

}
