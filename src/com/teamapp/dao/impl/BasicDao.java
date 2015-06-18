package com.teamapp.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.teamapp.dao.IBasicDao;

@SuppressWarnings("unchecked")
@Transactional
public abstract class BasicDao<E> implements IBasicDao<E> {

	@Resource
	private SessionFactory sessionFactory;

	private Class<E> clazz = null; 

	public BasicDao() {
		// get Class of E by reflection
		ParameterizedType pt = (ParameterizedType) this.getClass()
				.getGenericSuperclass(); // 注意这里，子类父类的关系
		this.clazz = (Class<E>) pt.getActualTypeArguments()[0];//取得是类型参数 E，就一个
	}

	protected Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public boolean insert(E t) {
		this.getSession().save(t);
		return true;
	}

	@Override
	public boolean update(E t) {
		this.getSession().update(t);
		return true;
	}

	@Override
	public boolean delete(E t) {
		this.getSession().delete(t);
		return false;
	}

	@Override
	public List<E> findAll() {
		return getSession().createQuery(//
				"FROM " + clazz.getSimpleName())//
				.list();
	}

	@Override
	public E getById(long id) {
		return (E) this.getSession().get(clazz, id);
	}

	@Override
	public boolean deleteById(Long id) {
		E e = this.getById(id);
		if (e != null) {
			this.delete(e);
		}
		return false;
	}

	@Override
	public List<E> getByIds(Long[] ids) {
		return getSession().createQuery(//
				"FROM " + clazz.getSimpleName() + " WHERE id IN (:ids) ")//
				.setParameterList("ids", ids)//
				.list();
	}

}
