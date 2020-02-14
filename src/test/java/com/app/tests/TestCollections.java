package com.app.tests;

import java.util.ArrayList;
import java.util.List;

import javax.json.bind.JsonbBuilder;

import com.app.beans.Product;
import com.app.beans.User;

public class TestCollections {

	public static void main(String[] args) {

		List objects = new ArrayList();
		objects.add("Jsonb");
		objects.add(23);
		objects.add(new User());
		String opencollection = JsonbBuilder.create().toJson(objects);
		System.out.println(opencollection);
		System.out.println( JsonbBuilder.create().fromJson(opencollection,ArrayList.class));

		List<Product> products = new ArrayList<>();
		products.add(new Product(1, "iphone8", 799.99, "Apple", "Good shippers"));
		products.add(new Product(2, "Kitchen Cutlery", 236.873, "Clean Kitchens", "Great shippers"));
		products.add(new Product(3, "Whirlpool Washing machine", 400, "Whirpool", "ABC shipping"));
		products.add(new Product(4, "Nike running shoes", 300, "Nike", null));
		products.add(null);
		String result = JsonbBuilder.create().toJson(products);

		List<Product>deserproducts= JsonbBuilder.create().fromJson(result, new ArrayList<Product>() {}.getClass().getGenericSuperclass());
		System.out.println(deserproducts);
		
	}

}
