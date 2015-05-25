package com.wilco.manage.login.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wilco.manage.global.beans.member.MemberBean;
import com.wilco.manage.global.beans.member.MemberSearchBean;


@Component("loginDao")
public class LoginDao {
	
	private final static Logger logger = Logger.getLogger(LoginDao.class);
	
	@Autowired
	private SqlSession sqlSession;
	
	
	public MemberBean getMemberInfo(MemberSearchBean searchBean){
		return (MemberBean) sqlSession.selectOne("login-admin.getMemberInfo" , searchBean);
	}
	
	
	
}