package com.app.tests;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

public class TestJsonPTypes {

	public static void main(String[] args) {
		JsonObject jsonObject = Json.createObjectBuilder().add("name", "Kartik")
				.add("profession", "Developer").build();
		
		Jsonb jsonb=JsonbBuilder.create();
		System.out.println(jsonb.toJson(jsonObject));
	}
}
