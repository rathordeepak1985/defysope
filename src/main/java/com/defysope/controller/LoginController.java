package com.defysope.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.defysope.service.LoginManager;

@Controller
public class LoginController {
	
	@Autowired
	private LoginManager manager;
	
	@RequestMapping(value = "/welcome.do")
	public ModelAndView loginPage(HttpServletRequest request) {

		return new ModelAndView("login.jsp");
	}

}
