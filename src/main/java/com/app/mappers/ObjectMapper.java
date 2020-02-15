package com.app.mappers;

import java.util.Locale;

import javax.json.bind.JsonbConfig;
import javax.json.bind.config.PropertyNamingStrategy;
import javax.json.bind.config.PropertyOrderStrategy;

import com.app.custom.CustomerNamingStrategy;
import com.app.custom.FieldsVisibilityStrategy;

public class ObjectMapper {

	public static JsonbConfig getObjectMapper() {
		JsonbConfig jsonconfig=new JsonbConfig();
		
		//Json formatting
		jsonconfig.withFormatting(true);
		
		//property naming strategy
		jsonconfig.withPropertyNamingStrategy(PropertyNamingStrategy.LOWER_CASE_WITH_UNDERSCORES);
		
		//property naming strategy by custom naming class
		jsonconfig.withPropertyNamingStrategy(new CustomerNamingStrategy());
		
		//property order strategy
		jsonconfig.withPropertyOrderStrategy(PropertyOrderStrategy.REVERSE);
		
		//property visibility strategy setting
		jsonconfig.withPropertyVisibilityStrategy(new FieldsVisibilityStrategy());
		
		//property nillable setting
		jsonconfig.withNullValues(true);
		
		//property settings for time
		jsonconfig.withDateFormat("yyyy/MM/dd", Locale.getDefault());
		
		
		return jsonconfig;
	}
	
}
