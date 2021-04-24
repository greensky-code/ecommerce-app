package com.store.productcatalogue.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.store.productcatalogue.model.OrderResponse;
import com.store.productcatalogue.model.Orders;
import com.store.productcatalogue.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	//ProductRepository productRepo;
	List<Product> ProdList = new ArrayList<>();
	//OrderRepository orderRepo;
	List<Orders> orderList = new ArrayList<>();
	Map<Date, OrderResponse> orderHistory = new HashMap<>();
	Map<Integer, Orders> orderExist = new HashMap<>();
	
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


	@Override
	public void createOrder(Orders order) {
		if(orderExist.get(order.getId())!=null) {
			for(Orders ordr : orderList) {
				if(ordr.getId().equals(order.getId())) {
					orderList.remove(ordr);
					ordr.setQty(ordr.getQty()+1);
					orderList.add(ordr);
					break;
				}
			}
			processProduct(order);
		} else {
			orderList.add(order);
			orderExist.put(order.getId(), order);
			processProduct(order);
		}
		//orderRepo.save(order);	
	}
	
	private void processProduct(Orders order) {
		for(Product prod : ProdList) {
			if(prod.getId().equals(order.getId())) {
				ProdList.remove(prod);
				prod.setQty(prod.getQty()-1);
				ProdList.add(prod);
				break;
			}
		}
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

	@Override
	public Map<Date, OrderResponse> orderHistory() {
		return orderHistory;
	}

	@Override
	public void transaction() {
		OrderResponse response = Orders();
		orderHistory.put(new Date(), response);
	}

	@Override
	public void deleteProduct(Integer id) {
		for(Product prod : ProdList) {
			if(prod.getId().equals(id)) {
				ProdList.remove(prod);
				break;
			}
		}
		
	}

}
