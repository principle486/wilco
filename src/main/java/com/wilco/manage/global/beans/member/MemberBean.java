package com.wilco.manage.global.beans.member;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Repository;


@Repository
@Alias("memberBean")
public class MemberBean {
	
	private String memId; 
	private String memPwd;  
	private String memName; 
	private String memMobile;
	private String memEmail;
	private String regDm;
	private String regId;
	private String updDm;
	private String updId;
	
	
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
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public String getMemMobile() {
		return memMobile;
	}
	public void setMemMobile(String memMobile) {
		this.memMobile = memMobile;
	}
	public String getMemEmail() {
		return memEmail;
	}
	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}
	public String getRegDm() {
		return regDm;
	}
	public void setRegDm(String regDm) {
		this.regDm = regDm;
	}
	public String getRegId() {
		return regId;
	}
	public void setRegId(String regId) {
		this.regId = regId;
	}
	public String getUpdDm() {
		return updDm;
	}
	public void setUpdDm(String updDm) {
		this.updDm = updDm;
	}
	public String getUpdId() {
		return updId;
	}
	public void setUpdId(String updId) {
		this.updId = updId;
	}
	
	
	
}