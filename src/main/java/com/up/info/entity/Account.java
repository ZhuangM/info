package com.up.info.entity;

import java.util.Date;

import com.up.info.base.BaseEntity;

/**
 * 账户
 * 
 * @author mazhuang
 */
public class Account extends BaseEntity {

	private static final long serialVersionUID = 5814579014251460767L;

	/** 用户名 */
	private String username;

	/** 密码 */
	private String password;

	/** 公司|门户名称 */
	private String company;

	/** 网址 */
	private String url;

	/** 记录创建时间 */
	private Date date;

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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
