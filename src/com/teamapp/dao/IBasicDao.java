package com.teamapp.dao;

import java.util.List;

public interface IBasicDao<T> {
	boolean insert(T t);

	boolean update(T t);

	boolean delete(T t);

	List<T> findAll();

	T getById(long id);

	List<T> getByIds(Long[] id);

	boolean deleteById(Long id);
}
