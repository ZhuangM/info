package com.up.info.entity;

import java.util.Date;

import com.up.info.base.BaseEntity;

/**
 * for login
 * 
 * @author mazhuang
 */
public class User extends BaseEntity {
	
	private static final long serialVersionUID = -2239351638433983874L;

	/** 用户名 */
	private String username;
	
	/** 密码 */
	private String password;
	
	/** 权限 */
	private String role;
	
	/** 创建日期 */
	private Date date;
	
	/** 姓名 */
	private String name;
	
	/** 联系方式 */
	private String tel;
	
	/** 电子邮件 */
	private String email;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
