package com.app.custom;

import javax.json.bind.config.PropertyNamingStrategy;

public class CustomerNamingStrategy implements PropertyNamingStrategy {

	@Override
	public String translateName(String propertyName) {
		return propertyName+"_";
	}

}
