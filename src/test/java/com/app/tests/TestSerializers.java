package com.app.tests;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import com.app.beans.Person;
import com.app.beans.Professor;
import com.app.beans.SoftwareDeveloper;
import com.app.mappers.ObjectMapper;


public class TestSerializers {

	public static void main(String[] args) {
		List<Person> people=new ArrayList<Person>();
		people.add(new Professor("Ichigo", "ichigo@kurosaki", "PhD", "Computations"));
		people.add(new SoftwareDeveloper("Uriyu", "uriyu@yashida", "Lead", "Amazon"));
		
		Type type =new ArrayList<Person>(){}.getClass().getGenericSuperclass();
		Jsonb jsonb=JsonbBuilder.create(ObjectMapper.getObjectMapper());
		String result=jsonb.toJson(people, type);
		System.out.println(result);
		
		List<Person> deser=jsonb.fromJson(result, type);
		System.out.println(deser);
		
	}
	
}
