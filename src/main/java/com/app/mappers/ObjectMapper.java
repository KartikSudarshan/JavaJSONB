package com.app.mappers;

import javax.json.bind.JsonbConfig;

public class ObjectMapper {

	public static JsonbConfig getObjectMapper() {
		JsonbConfig jsonconfig=new JsonbConfig();
		jsonconfig.withFormatting(true);
		return jsonconfig;
	}
	
}
