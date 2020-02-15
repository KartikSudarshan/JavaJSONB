package com.app.tests;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import com.app.beans.Product;
import com.app.mappers.ObjectMapper;

public class TestNillable {

	public static void main(String[] args ) {
		Jsonb jsonb=JsonbBuilder.create(ObjectMapper.getObjectMapper());
		//Product product=new Product();
		
		Product product=new Product(123, "TYU", 7895.2315, "poiu", null);
		
		System.out.println(jsonb.toJson(product));
	}
}
