package com.up.info.entity;

import java.util.Date;

import com.up.info.base.BaseEntity;

public class Money extends BaseEntity {
	private static final long serialVersionUID = -1846046989463844193L;

	/** 金额 */
	private String amount;
	
	/** 来源 */
	private String from;
	
	/** 去向 */
	private String to;
	
	/** 花销类型 */
	private String type;
	
	/** 日期 yyyy-MM-dd */
	private Date date;

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
