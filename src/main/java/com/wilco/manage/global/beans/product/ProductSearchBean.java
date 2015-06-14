package com.wilco.manage.global.beans.product;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Repository;

import com.wilco.manage.global.beans.common.SearchBean;


@Repository
@Alias("productSearchBean")
public class ProductSearchBean extends SearchBean {
	
	private String pdMngId; 
	private String pdName;
	private String[] pdMngIds;
	
	public String getPdMngId() {
		return pdMngId;
	}
	public void setPdMngId(String pdMngId) {
		this.pdMngId = pdMngId;
	}
	public String getPdName() {
		return pdName;
	}
	public void setPdName(String pdName) {
		this.pdName = pdName;
	}
	public String[] getPdMngIds() {
		return pdMngIds;
	}
	public void setPdMngIds(String[] pdMngIds) {
		this.pdMngIds = pdMngIds;
	}

	
}