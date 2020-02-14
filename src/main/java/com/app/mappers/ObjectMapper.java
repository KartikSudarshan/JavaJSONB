package com.app.mappers;

import javax.json.bind.JsonbConfig;
import javax.json.bind.config.PropertyNamingStrategy;

import com.app.custom.CustomerNamingStrategy;

public class ObjectMapper {

	public static JsonbConfig getObjectMapper() {
		JsonbConfig jsonconfig=new JsonbConfig();
		
		//Json formatting
		jsonconfig.withFormatting(true);
		
		//property naming strategy
		jsonconfig.withPropertyNamingStrategy(PropertyNamingStrategy.LOWER_CASE_WITH_UNDERSCORES);
		
		//property naming strategy by custom naming class
		jsonconfig.withPropertyNamingStrategy(new CustomerNamingStrategy());
		return jsonconfig;
	}
	
}
