package com.up.info.dao;

import org.apache.ibatis.annotations.Param;

import com.up.info.base.BaseDAO;
import com.up.info.entity.User;

public interface UserDAO extends BaseDAO<User> {

	/**
	 * 登陆身份校验
	 * 
	 * @param username
	 *            用户名
	 * @param password
	 *            密码
	 * @param role
	 *            身份标识（0：用户、1：管理员、2：超级管理员）
	 * @return
	 */
	public int query4Login(@Param("username") String username, @Param("password") String password,
			@Param("role") String role);

}
