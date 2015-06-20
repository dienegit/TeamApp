package com.teamapp.service;

import java.util.List;

public interface IBaseService<T> {
	void create(T entity);

	boolean modify(T entity);

	boolean delete(T entity);

	T getById(long id);

	List<T> getAll();
}
