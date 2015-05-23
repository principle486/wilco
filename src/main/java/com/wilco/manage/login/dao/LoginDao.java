package com.wilco.manage.login.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wilco.manage.global.beans.member.MemberBean;


@Component("loginDao")
public class LoginDao {
	
	private final static Logger logger = Logger.getLogger(LoginDao.class);
	
	@Autowired
	private SqlSession sqlSession;

	
	public MemberBean getLoginInfo(){
		logger.debug("call dao=>" + sqlSession);
		return sqlSession.selectOne("login-admin.getLoginInfo");
	}
	
	
	
}