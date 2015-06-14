package com.wilco.manage.global.security.session.service;

import org.springframework.stereotype.Service;

import com.wilco.manage.global.beans.member.MemberBean;
import com.wilco.manage.global.beans.security.SessionBean;

@Service("sessionManager")
public interface SessionManager {
	
	public SessionBean getAuthentication(MemberBean memberBean);
	
}