package com.app.tests;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import com.app.mappers.ObjectMapper;

public class TestBinaryStrategies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte[] bytes="Json-D is easy to learn".getBytes();
		Jsonb jsonb1=JsonbBuilder.create();
		System.out.println(jsonb1.toJson(bytes));
		Jsonb jsonb2=JsonbBuilder.create(ObjectMapper.getObjectMapper());
		System.out.println(jsonb2.toJson(bytes));

	}

}
