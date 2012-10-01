package com.defysope.service.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.defysope.dao.LoginDao;
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

}
