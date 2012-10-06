package com.defysope.dao;

import java.util.List;
import java.util.Map;

import com.defysope.model.User;

public interface LoginDao {

	User saveUser(User user);

	List<Map<String, Object>> getUsers();

	User loadUser(int id);

}
