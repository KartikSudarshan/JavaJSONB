package com.app.tests;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import com.app.beans.Customer;
import com.app.mappers.ObjectMapper;

public class TestCustomAdapters {

	public static void main(String[] args) {
		Jsonb jsonb=JsonbBuilder.create(ObjectMapper.getObjectMapper());
		Customer customer=new Customer(123,"JsonTester","kj@gmail.com",true);
		String result=jsonb.toJson(customer);
		System.out.println(result);
		Customer customer2=jsonb.fromJson(result, Customer.class);
		System.out.println(customer2);

	}

}
