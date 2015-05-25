package com.wilco.manage.login.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wilco.manage.global.beans.member.MemberBean;
import com.wilco.manage.global.beans.member.MemberSearchBean;
import com.wilco.manage.login.service.LoginManager;

@Controller
public class LoginAction {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginAction.class);
	
	@Autowired
	private LoginManager loginManager;
	@Autowired
	private MemberBean memberBean;
	@Autowired
	private MemberSearchBean memberSearchBean;
	
	@RequestMapping(value="/login/login.wilco" , method=RequestMethod.GET)
	public String login(){
		return "login/login";
	}
	
	
	@RequestMapping(value="/login/loginProcess.wilco" , method=RequestMethod.POST)
	public String loginProcess(@ModelAttribute("memberSearchBean") MemberSearchBean memberSearchBean) {
		String result = "";
		
		result = loginManager.loginProcess(memberSearchBean);
		
		if(result.equals("SUCCESS")){
			return "common/loginSuccess";
		}else{
			return "common/loginFail";
		}
	}
	
}