package com.app.tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbException;

import com.app.beans.OrderDetails;

public class TestCustomCreator {

	public static void main(String[] args) {
		Jsonb jsonb =JsonbBuilder.create();
		try {
		OrderDetails details=		jsonb.fromJson(new FileReader(new File("D:\\EclipseEE\\workspace\\JavaJSONB\\neworders.txt")), OrderDetails.class);
		System.out.println(details.getShippingAddress());
		} catch (JsonbException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

}
