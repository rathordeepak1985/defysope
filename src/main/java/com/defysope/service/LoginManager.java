package com.defysope.service;

import java.util.List;
import java.util.Map;

import com.defysope.model.User;

public interface LoginManager {

	User saveUser(User user);

	List<Map<String, Object>> getUsers();

	User loadUser(int id);

}
