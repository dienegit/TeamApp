package com.teamapp.dao;

public interface IBasicDao<T> {
	boolean insert(T t);

	boolean update(T t);

	boolean delete(T t);

}
