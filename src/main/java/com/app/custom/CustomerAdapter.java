package com.app.custom;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.bind.adapter.JsonbAdapter;
import javax.swing.text.DefaultEditorKit.CutAction;

import com.app.beans.Customer;

public class CustomerAdapter implements JsonbAdapter<Customer, JsonObject> {

	@Override
	public JsonObject adaptToJson(Customer obj) throws Exception {
		// This method takes Original Customer do any serialization required and turn it
		// into a Json
		JsonObject jsonObject = null;
		if (obj.isPrimeUser()) {
			jsonObject = Json.createObjectBuilder().add("customerId", obj.getCustomerId())
					.add("isPrimeUser", "PRIME_USER").build();
		}
		else {
			jsonObject = Json.createObjectBuilder().add("customerId", obj.getCustomerId())
					.add("isPrimeUser", "REGULAR_USER").build();
		}

		return jsonObject;
	}

	@Override
	public Customer adaptFromJson(JsonObject obj) throws Exception {
		// This method takes Json Object do any deserialization required and turn it
		// into a Customer

		Customer customer=new Customer();
		customer.setCustomerId(obj.getInt("customerId"));
		if (obj.getString("isPrimeUser").contentEquals("PRIME_USER")) {
			customer.setPrimeUser(true);
		}
		else {
			customer.setPrimeUser(false);
		}
		return customer;
		
	}

}
