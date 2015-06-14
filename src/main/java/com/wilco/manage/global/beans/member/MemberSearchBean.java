package com.wilco.manage.global.beans.member;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Repository;

import com.wilco.manage.global.beans.common.SearchBean;


@Repository
@Alias("memberSearchBean")
public class MemberSearchBean extends SearchBean {
	
	private String memId; 
	private String memPwd;  
	
	
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemPwd() {
		return memPwd;
	}
	public void setMemPwd(String memPwd) {
		this.memPwd = memPwd;
	}
	
}