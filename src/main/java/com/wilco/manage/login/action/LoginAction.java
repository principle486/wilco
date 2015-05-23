package com.wilco.manage.login.action;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wilco.manage.global.beans.member.MemberBean;
import com.wilco.manage.login.service.LoginManager;

@Controller
public class LoginAction {
	
	private final static Logger logger = Logger.getLogger(LoginAction.class);
	
	@Autowired
	private LoginManager loginManager;
	@Autowired
	private MemberBean memberBean;
	
	@RequestMapping(value="/login/login.wilco" , method=RequestMethod.POST)
	public String login() {
		memberBean = loginManager.loginInfo();
		return null;
		
	}
	
}