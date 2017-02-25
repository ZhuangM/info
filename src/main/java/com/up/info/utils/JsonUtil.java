package com.up.info.utils;

import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;

import com.up.info.entity.Account;

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

	private static final String json = "{\"id\":2,\"username\":null,\"password\":\"2222\",\"company\":\"111\",\"url\":null,\"create_time\":null,\"alter_time\":null}";

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Account account = new Account();
		account.setCompany("111");
		account.setPassword("2222");
		System.out.println(toJson(account));
		Map<String, Object> acc = (Map<String, Object>) fromJson(json, Map.class);
		for (Entry<String, Object> entry : acc.entrySet()) {
			System.out.println(entry.getKey() + " | " + entry.getValue());
		}
		Account acc_1 = fromJson(toJson(acc), Account.class);
		System.out.println(acc_1.getId());
	}
}
