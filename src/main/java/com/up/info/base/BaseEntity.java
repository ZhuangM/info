package com.up.info.base;

import java.io.Serializable;

public abstract class BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1139747711434600L;

	private int id;
	private String uuid;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
