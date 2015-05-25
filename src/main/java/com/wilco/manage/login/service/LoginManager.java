package com.wilco.manage.login.service;

import org.springframework.stereotype.Service;

import com.wilco.manage.global.beans.member.MemberSearchBean;

@Service("loginManager")
public interface LoginManager {
	
	public String loginProcess(MemberSearchBean searchBean);
	
}