package com.defysope.dao.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.defysope.dao.LoginDao;
import com.defysope.model.User;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	private SessionFactory factory;

	public User saveUser(User user) {
		factory.getCurrentSession().save(user);

		return user;
	}

	public List<Map<String, Object>> getUsers() {

		return factory.getCurrentSession().createCriteria(User.class).list();
	}

	public User loadUser(int id) {

		return (User) factory.getCurrentSession().load(User.class, id);
	}

}
