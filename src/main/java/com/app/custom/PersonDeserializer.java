package com.app.custom;

import java.lang.reflect.Type;

import javax.json.bind.serializer.DeserializationContext;
import javax.json.bind.serializer.JsonbDeserializer;
import javax.json.stream.JsonParser;

import com.app.beans.Person;

public class PersonDeserializer implements JsonbDeserializer<Person>{

	@Override
	public Person deserialize(JsonParser parser, DeserializationContext decontext, Type rtType) {
		parser.next();
		String classname=parser.getString();
		parser.next();
		Person person=null;
		try {
			person=decontext.deserialize(Class.forName(classname).asSubclass(Person.class)  , parser);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return person;
	
	
	}

}
