package com.up.info.service.impl;

import java.util.Date;
import java.util.UUID;

import com.up.info.entity.User;
import com.up.info.service.IUserService;

public class UserServiceImpl implements IUserService {

	@Override
	public User queryById(int id) {
		User user = new User();
		user.setDate(new Date());
		user.setEmail("1111111@sysnew.com");
		user.setId(id);
		user.setName("zhangsan");
		user.setPassword("password");
		user.setRole("1");
		user.setTel("13800001111");
		user.setUsername("zhangsan");
		user.setUuid(String.valueOf(UUID.randomUUID()));
		return user;
	}
	
}
