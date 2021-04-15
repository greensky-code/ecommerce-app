package com.store.productcatalogue.model;

import java.util.List;

public class OrderResponse {

	private List<Orders> order;
	private double total;
	
	public List<Orders> getOrder() {
		return order;
	}
	public void setOrder(List<Orders> order) {
		this.order = order;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}

}
