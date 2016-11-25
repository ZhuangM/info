package com.up.info.utils;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtil {
	private static final Logger logger = Logger.getLogger(JsonUtil.class);
	private static final ObjectMapper mapper = new ObjectMapper();
	
	/**
	 * 
	 * @param obj
	 * @return
	 */
	public static String toJson(Object obj) {
		try {
			return mapper.writeValueAsString(obj);
		} catch (Exception e) {
			logger.warn("can not convert" + obj + " to json.");
			e.printStackTrace();
		}
		return "{}";
	}
	
	/**
	 * 
	 * @param json
	 * @param t
	 * @return
	 */
	public static <T> T fromJson(String json, Class<T> t) {
		if (null == json || "".equals(json)) {
			return null;
		}
		try {
			return mapper.readValue(json, t);
		} catch (Exception e) {
			logger.warn("can not parse json: " + json + " .");
			e.printStackTrace();
		}
		return null;
	}
}
