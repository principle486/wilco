package com.wilco.manage.login.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wilco.manage.global.beans.member.MemberBean;
import com.wilco.manage.login.dao.LoginDao;


@Service("loginManager")
public class LoginManagerImpl implements LoginManager {
	
	private final static Logger logger = Logger.getLogger(LoginManagerImpl.class);
	
	@Autowired
	private LoginDao loginDao;
	
	
	public MemberBean loginInfo(){
		logger.debug("call service");
		return (MemberBean) loginDao.getLoginInfo();
	}
}