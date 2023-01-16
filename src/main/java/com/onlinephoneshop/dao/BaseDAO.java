package com.onlinephoneshop.dao;

import java.sql.Connection;
import java.util.*;

public class BaseDAO<T> {
	private Connection getConnection() {
		return null;
	}
	
	protected int delete(int id) {return 0;}
	
	protected int updateEntity(T entity) {return 0;}
	
	protected int createEntity(T entity) {return 0;}
	
	protected T findEntity(int id) {return null;}
	
	protected List<T> listAllEntity(){return null;}
	
}
