package com.defysope.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.defysope.model.User;
import com.defysope.service.LoginManager;

@Controller
public class LoginController {

	@Autowired
	private LoginManager manager;

	@RequestMapping(value = "/welcome.do")
	public ModelAndView loginPage(HttpServletRequest request,ModelMap map) {
		map.put("userList", manager.getUsers());
		return new ModelAndView("login.jsp",map);
	}

	@RequestMapping(value = "/saveuser.do", method = RequestMethod.POST)
	public @ResponseBody
	Object addUser(HttpServletRequest request, @ModelAttribute("user") User user) {
		User userNew = manager.saveUser(user);
		return userNew;

	}
	@RequestMapping(value = "/edituser.do", method = RequestMethod.POST)
	public @ResponseBody
	Object edituser(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("cid"));
		User userNew = manager.loadUser(id);
		return userNew;
		
	}

}
