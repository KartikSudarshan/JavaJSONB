package com.app.beans;

import java.util.List;

public class OrderDetails {

	private List<Product> products;
	private Address shippingAddress;
	private double totalAmmount;
	
	public OrderDetails() {
		
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
