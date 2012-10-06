package com.defysope.service.impl;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.defysope.dao.LoginDao;
import com.defysope.model.User;
import com.defysope.service.LoginManager;

@Service
@Transactional
public class LoginManagerImpl implements LoginManager {

	@Autowired
	private LoginDao dao;

	@RequestMapping(value = "/welcome.do")
	public ModelAndView loginPage(HttpServletRequest request) {
		return new ModelAndView("login.jsp");
	}

	public User saveUser(User user) {
		
		return dao.saveUser(user) ;
	}

	public List<Map<String, Object>> getUsers() {
		
		return dao.getUsers();
	}

	public User loadUser(int id) {
		
		return dao.loadUser(id);
	}

}
