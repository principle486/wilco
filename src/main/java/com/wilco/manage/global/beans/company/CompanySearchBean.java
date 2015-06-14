package com.wilco.manage.global.beans.company;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Repository;

import com.wilco.manage.global.beans.common.SearchBean;


@Repository
@Alias("companySearchBean")
public class CompanySearchBean extends SearchBean{
	
	private String cpMngId; 
	private String cpName;
	private String[] cpMngIds;
	
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
	public String[] getCpMngIds() {
		return cpMngIds;
	}
	public void setCpMngIds(String[] cpMngIds) {
		this.cpMngIds = cpMngIds;
	}  
	
}