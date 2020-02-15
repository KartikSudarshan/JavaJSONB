package com.app.tests;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import com.app.beans.Order;
import com.app.mappers.ObjectMapper;
import com.app.util.DataGenerator;

public class TestDateTimeFormats {

	public static void main(String[] args) {
		/*
		 * Jsonb jsonb=JsonbBuilder.create(); System.out.println(jsonb.toJson(new
		 * Date(789456)));
		 */
		
		Order order = DataGenerator.getData();
        Jsonb jsonb = JsonbBuilder.create(ObjectMapper.getObjectMapper());
       try(Writer writer = new FileWriter(new File("ordernew.txt"))){
           writer.write(jsonb.toJson(order));
           writer.flush();
       } catch (IOException ex) {
            Logger.getLogger(TestDataTypes.class.getName()).log(Level.SEVERE, null, ex);
        }
	}
	
}
