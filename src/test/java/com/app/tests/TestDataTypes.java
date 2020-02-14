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

import com.app.beans.Order;
import com.app.util.DataGenerator;

public class TestDataTypes {
	public static void main(String[] args) {
        Order order = DataGenerator.getData();
        Jsonb jsonb = JsonbBuilder.create();
       try(Writer writer = new FileWriter(new File("order.txt"))){
           writer.write(jsonb.toJson(order));
           writer.flush();
       } catch (IOException ex) {
            Logger.getLogger(TestDataTypes.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        try {
            Order deserializedOrder = jsonb.fromJson(new FileReader(new File("order.txt")), Order.class);
            System.out.println(deserializedOrder); 
       } catch (FileNotFoundException ex) {
            Logger.getLogger(TestDataTypes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
