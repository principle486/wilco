package com.wilco.manage.login.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wilco.manage.global.beans.member.MemberBean;
import com.wilco.manage.global.beans.member.MemberSearchBean;
import com.wilco.manage.global.beans.security.SessionBean;
import com.wilco.manage.global.security.session.service.SessionManager;
import com.wilco.manage.login.dao.LoginDao;


@Service("loginManager")
public class LoginManagerImpl implements LoginManager {
	
	private final static Logger logger = Logger.getLogger(LoginManagerImpl.class);
	
	
	@Autowired
	private SessionManager sessionManager;
	@Autowired
	private LoginDao loginDao;
	
	
	public String loginProcess(MemberSearchBean searchBean) {
		String result = "";
		
		MemberBean memberBean = loginDao.getMemberInfo(searchBean);;
		SessionBean sessionBean = new SessionBean();
		
		//the member checks from database
		if(memberBean == null){
			// member is null
			result = "NONE"; 
		}else{
			// member is not null
			logger.debug("memberBean.memNm==>" + memberBean.getMemId());
			logger.debug("memberBean.memPwd==>" + memberBean.getMemPwd());
			sessionBean = sessionManager.getAuthentication(memberBean);
			result = "SUCCESS";
		}
		
		return result;
	}
}