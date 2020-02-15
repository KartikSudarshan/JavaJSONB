package com.app.tests;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import com.app.mappers.ObjectMapper;

public class TestIJson {

	public static void main(String[] args) {
		Jsonb jsonb1=JsonbBuilder.create();
		String text="JsonB";
		System.out.println(jsonb1.toJson(text));
		
		//This will fail as IJson is enabled
		/*
		 * Jsonb jsonb2=JsonbBuilder.create(ObjectMapper.getObjectMapper());
		 * System.out.println(jsonb2.toJson(text));
		 */
		
		//Below code will work as its a Json Object that is sent rather than just text
		JsonObject jsonObject=Json.createObjectBuilder().add("Course", text).build();
		 Jsonb jsonb2=JsonbBuilder.create(ObjectMapper.getObjectMapper());
		 System.out.println(jsonb2.toJson(jsonObject));

	}

}
