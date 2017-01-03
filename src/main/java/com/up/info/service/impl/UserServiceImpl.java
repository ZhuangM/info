package com.up.info.service.impl;

import java.util.Date;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.up.info.dao.UserDAO;
import com.up.info.entity.User;
import com.up.info.service.IUserService;

public class UserServiceImpl implements IUserService {
	private static final Logger logger = Logger.getLogger(UserServiceImpl.class);

	@Resource
	UserDAO userDAO;

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

	@Override
	public boolean verifyIdentity(User user) {
		if (null == user || StringUtils.isBlank(user.getUsername()) || StringUtils.isBlank(user.getPassword())
				|| StringUtils.isBlank(user.getRole())) {
			logger.warn("[username | password | role] is empty.");
			return false;
		}
		int count = userDAO.query4Login(user.getUsername(), user.getPassword(), user.getRole());
		if (count != 1) {
			logger.warn("user's count is not 1.");
			return false;
		}
		return true;
	}

}
