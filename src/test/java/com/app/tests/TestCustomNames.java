package com.app.tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import com.app.beans.Customer;
import com.app.mappers.ObjectMapper;

public class TestCustomNames {

	public static void main(String[] args) {
		Jsonb jsonb= JsonbBuilder.create(ObjectMapper.getObjectMapper());
		Customer customer = new Customer(123, "Rachel Green", "test@gmail.com", true);
		try(Writer writer = new FileWriter(new File("customer.txt"))){
	           writer.write(jsonb.toJson(customer));
	           writer.flush();
	       } catch (IOException ex) {
	            Logger.getLogger(TestCustomNames.class.getName()).log(Level.SEVERE, null, ex);
	        }
	       
	        try {
	            Customer deserializedCustomer = jsonb.fromJson(new FileReader(new File("customer.txt")), Customer.class);
	            System.out.println(deserializedCustomer); 
	       } catch (FileNotFoundException ex) {
	            Logger.getLogger(TestCustomNames.class.getName()).log(Level.SEVERE, null, ex);
	        }

	}

}
