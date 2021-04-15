package com.store.productcatalogue.model;

/*@Entity
@Table(name = "product")*/
public class Product {
    
	//@Id
    //@Column(name = "id")
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
   // @Column(name = "title")
	private String title;
    //@Column(name = "color")
	private String color;
    //@Column(name = "reason")
	private String reason;
    //@Column(name = "barcode")
	private String barcode;
    //@Column(name = "desc")
	private String desc;
    //@Column(name = "qty")
	private Integer qty;
    //@Column(name = "price")
	private Double price;

	public Product() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
