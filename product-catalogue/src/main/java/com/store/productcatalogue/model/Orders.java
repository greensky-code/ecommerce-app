package com.store.productcatalogue.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * @Author
 * Dhruv Shah
 */

@Entity
@Table(name = "Orders")
public class Orders {
	
    @Id
    @Column(name = "id")
	private Integer Id;
   @Column(name = "title")
	private String title;
    @Column(name = "barcode")
	private String barcode;
    @Column(name = "price")
	private Double price;
    @Column(name = "qty")
	private Integer qty;
	
	public Orders() {
		
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}
	
}
