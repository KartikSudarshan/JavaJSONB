package com.app.tests;

import java.util.Date;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import com.app.beans.User;

public class TestSimpleBean {

	public static void main(String[]  args) {
		//Create an instance of User
		//User user=new User();
		/*
		 * user.setId(123); user.setEmail("test@gmail.com"); user.setDate(new
		 * Date(456789)); user.setName("JsonTester");
		 */
		
		User user=new User(123,"Jsontester","test@gmail.com",new Date(456789));
		//this will fail with Can't create instance of a class: class com.app.beans.User, No default constructor found
		//Always ensure default constructor is added
		
		//Create JsonB instance from JsonbBuilder
		Jsonb jsonb=JsonbBuilder.create();
		
		//Use Jsonb.toJson() to convert the user object into JSON representation
		String result =jsonb.toJson(user);
		System.out.println(result);
		
		//Use Jsonb.fromJson() to convert the JSON String back to a User Object
		Jsonb jsonb1=JsonbBuilder.create();
		User user2=jsonb1.fromJson(result, User.class);
		System.out.println("user 2 details are: \n"+user2);
		
	}
	
}
