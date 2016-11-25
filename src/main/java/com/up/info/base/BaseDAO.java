package com.up.info.base;

import java.util.List;

public interface BaseDAO<T extends BaseEntity> {
	
	List<T> queryAll();
	
	void createRecord(T t);
	
	void updateRecord(T t);
	
	void deleteRecord(T t);
	
	T queryById(int id);
}
