package com.app.beans;

import java.util.List;

import javax.json.bind.annotation.JsonbCreator;
import javax.json.bind.annotation.JsonbProperty;

public class OrderDetails {

	private List<Product> products;
	private Address shippingAddress;
	private double totalAmmount;

	public OrderDetails() {

	}

	@JsonbCreator
	public OrderDetails(@JsonbProperty("products") List<Product> products, @JsonbProperty("city") String city,
			@JsonbProperty("country") String country, @JsonbProperty("street") String street,
			@JsonbProperty("zipcode") int zipcode, @JsonbProperty("totalAmmount") double totalAmmount) {

		this.products=products;
		this.totalAmmount=totalAmmount;
		this.shippingAddress=new Address(street, city, country, zipcode);
		
	}

	public OrderDetails(List<Product> products, Address shippingAddress, double totalAmmount) {
		super();
		this.products = products;
		this.shippingAddress = shippingAddress;
		this.totalAmmount = totalAmmount;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public double getTotalAmmount() {
		return totalAmmount;
	}

	public void setTotalAmmount(double totalAmmount) {
		this.totalAmmount = totalAmmount;
	}

	@Override
	public String toString() {
		return "OrderDetails [products=" + products + ", shippingAddress=" + shippingAddress + ", totalAmmount="
				+ totalAmmount + "]";
	}

}
