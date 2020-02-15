package com.app.beans;

import java.util.List;
import javax.json.bind.annotation.JsonbNumberFormat;
import javax.json.bind.annotation.JsonbProperty;

public class OrderDetails {

    private List<Product> products;
    private Address shippingAddress;
    
    @JsonbNumberFormat("#.00")
    private double totalAmount;

    public OrderDetails(List<Product> products, Address shippingAddress, double totalAmount) {
        this.products = products;
        this.shippingAddress = shippingAddress;
        this.totalAmount = totalAmount;
    }

    //@JsonbCreator
    public OrderDetails(@JsonbProperty("products") List<Product> products, @JsonbProperty("city") String city, @JsonbProperty("country") String country, @JsonbProperty("street")String street, @JsonbProperty("zipcode") int zipcode,@JsonbProperty("totalAmount") double totalAmount) {
        this.products = products;
        this.shippingAddress = new Address(street, city, country, zipcode);
        this.totalAmount = totalAmount;
        

    }

    public OrderDetails() {
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

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "OrderDetails{" + "products=" + products + ", shippingAddress=" + shippingAddress + ", totalAmount=" + totalAmount + '}';
    }

}
