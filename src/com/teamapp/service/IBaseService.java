package com.teamapp.service;

public interface IBaseService<T> {
	void create(T entity);

	boolean modify(T entity);

	boolean delete(T entity);
}
