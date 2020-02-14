package com.app.util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.app.beans.Address;
import com.app.beans.Customer;
import com.app.beans.Order;
import com.app.beans.OrderDetails;
import com.app.beans.Product;

public class DataGenerator {
	 public static Order getData(){
	        Address address = new Address();
	        address.setCity("Los Angeles");
	        address.setCountry("USA");
	        address.setZipcode(91234);
	        address.setStreet("XYZ Avenue");
	        
	        List<Product> products = new ArrayList<>();
	        products.add(new Product(1, "iphone8", 799.99, "Apple", "Good shippers"));
	        products.add(new Product(2, "Kitchen Cutlery", 236.873, "Clean Kitchens", "Great shippers"));
	        products.add(new Product(3, "Whirlpool Washing machine", 400, "Whirpool", "ABC shipping"));
	        products.add(new Product(4, "Nike running shoes", 300, "Nike", null));
	        products.add(null);
	        
	        OrderDetails orderDetails = new OrderDetails(products, address, 1763.863);
	        
	        
	        Customer customer = new Customer(123, "Rachel Green", "test@gmail.com", true);
	        
	        Order order = new Order( orderDetails, 199,LocalDate.parse("2018-08-01"), LocalDate.parse("2018-08-10"),customer);
	        
	        return order;
	        
	    }
}
