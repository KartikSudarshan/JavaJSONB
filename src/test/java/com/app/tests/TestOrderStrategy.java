package com.app.tests;

import java.util.ArrayList;
import java.util.List;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import com.app.beans.Product;
import com.app.mappers.ObjectMapper;

public class TestOrderStrategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> products = new ArrayList<>();
		products.add(new Product(1, "iphone8", 799.99, "Apple", "Good shippers"));
		products.add(new Product(2, "Kitchen Cutlery", 236.873, "Clean Kitchens", "Great shippers"));
		products.add(new Product(3, "Whirlpool Washing machine", 400, "Whirpool", "ABC shipping"));
		products.add(new Product(4, "Nike running shoes", 300, "Nike", null));
		products.add(null);
		Jsonb jsonb=JsonbBuilder.create(ObjectMapper.getObjectMapper());
		System.out.println(jsonb.toJson(products));
		
		
	}

}
