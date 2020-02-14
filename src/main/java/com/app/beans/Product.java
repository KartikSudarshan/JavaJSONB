package com.app.beans;

import javax.json.bind.annotation.JsonbPropertyOrder;
import javax.json.bind.config.PropertyOrderStrategy;

//@JsonbPropertyOrder(PropertyOrderStrategy.REVERSE)
public class Product {

	private int id;
	private String name;
	private String manufacturer;
	private String shippingCompany;
	private double price;
	
	public Product(){
		
	}
	
	public Product(int id, String name,  double price,String manufacturer, String shippingCompany) {
		super();
		this.id = id;
		this.name = name;
		this.manufacturer = manufacturer;
		this.shippingCompany = shippingCompany;
		this.price = price;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getShippingCompany() {
		return shippingCompany;
	}

	public void setShippingCompany(String shippingCompany) {
		this.shippingCompany = shippingCompany;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", manufacturer=" + manufacturer + ", shippingCompany="
				+ shippingCompany + ", price=" + price + "]";
	}
	
	
	
}
