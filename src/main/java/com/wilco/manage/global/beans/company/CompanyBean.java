package com.wilco.manage.global.beans.company;

import org.springframework.stereotype.Repository;

@Repository
public class CompanyBean {
	
	private String cpMngId; 
	private String cpName;  
	private String cpWorkNm; 
	private String cpWorkOffice;
	private String cpWorkFax;
	private String cpWorkTel;
	private String cpWorkMobile;
	private String cpWorkEmail;
	private String regDm;
	private String regId;
	private String updDm;
	private String updId;
	
	public String getCpMngId() {
		return cpMngId;
	}
	public void setCpMngId(String cpMngId) {
		this.cpMngId = cpMngId;
	}
	public String getCpName() {
		return cpName;
	}
	public void setCpName(String cpName) {
		this.cpName = cpName;
	}
	public String getCpWorkNm() {
		return cpWorkNm;
	}
	public void setCpWorkNm(String cpWorkNm) {
		this.cpWorkNm = cpWorkNm;
	}
	public String getCpWorkOffice() {
		return cpWorkOffice;
	}
	public void setCpWorkOffice(String cpWorkOffice) {
		this.cpWorkOffice = cpWorkOffice;
	}
	public String getCpWorkFax() {
		return cpWorkFax;
	}
	public void setCpWorkFax(String cpWorkFax) {
		this.cpWorkFax = cpWorkFax;
	}
	public String getCpWorkTel() {
		return cpWorkTel;
	}
	public void setCpWorkTel(String cpWorkTel) {
		this.cpWorkTel = cpWorkTel;
	}
	public String getCpWorkMobile() {
		return cpWorkMobile;
	}
	public void setCpWorkMobile(String cpWorkMobile) {
		this.cpWorkMobile = cpWorkMobile;
	}
	public String getCpWorkEmail() {
		return cpWorkEmail;
	}
	public void setCpWorkEmail(String cpWorkEmail) {
		this.cpWorkEmail = cpWorkEmail;
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