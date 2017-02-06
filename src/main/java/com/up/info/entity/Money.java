package com.up.info.entity;

import java.util.Date;

import com.up.info.base.BaseEntity;

public class Money extends BaseEntity {
	private static final long serialVersionUID = -1846046989463844193L;

	/** 金额 */
	private String amount;
	
	/** 资金来源 */
	private String fromDesc;
	
	/** 来源类型 */
	private String fromType;
	
	/** 资金去向 */
	private String toDesc;
	
	/** 去向类型 */
	private String toType;
	
	/** 花销类型 */
	private String type;
	
	/** 日期 yyyy-MM-dd HH:mm:ss */
	private Date create_time;
	
	private Date alter_time;

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFromDesc() {
		return fromDesc;
	}

	public void setFromDesc(String fromDesc) {
		this.fromDesc = fromDesc;
	}

	public String getFromType() {
		return fromType;
	}

	public void setFromType(String fromType) {
		this.fromType = fromType;
	}

	public String getToDesc() {
		return toDesc;
	}

	public void setToDesc(String toDesc) {
		this.toDesc = toDesc;
	}

	public String getToType() {
		return toType;
	}

	public void setToType(String toType) {
		this.toType = toType;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getAlter_time() {
		return alter_time;
	}

	public void setAlter_time(Date alter_time) {
		this.alter_time = alter_time;
	}
}
