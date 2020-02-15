package com.app.custom;

import javax.json.bind.serializer.JsonbSerializer;
import javax.json.bind.serializer.SerializationContext;
import javax.json.stream.JsonGenerator;

import com.app.beans.Person;

public class PersonSerializer implements JsonbSerializer<Person> {

	@Override
	public void serialize(Person person, JsonGenerator jsonGenerator, SerializationContext context) {
		// TODO Auto-generated method stub
		
		jsonGenerator.writeStartObject();
		context.serialize(person.getClass().getName(), person, jsonGenerator);
		jsonGenerator.writeEnd();
	}

}
