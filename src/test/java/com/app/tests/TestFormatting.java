package com.app.tests;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import com.app.beans.Order;
import com.app.mappers.ObjectMapper;
import com.app.util.DataGenerator;

public class TestFormatting {
	public static void main(String[] args) {
		Jsonb jsonb= JsonbBuilder.create(ObjectMapper.getObjectMapper());
		Order order=DataGenerator.getData();
		System.out.println(jsonb.toJson(order));
		
	}
}
