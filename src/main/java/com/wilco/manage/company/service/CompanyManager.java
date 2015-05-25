package com.wilco.manage.company.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wilco.manage.global.beans.company.CompanyBean;
import com.wilco.manage.global.beans.company.CompanySearchBean;
import com.wilco.manage.global.paging.Paging;

@Service("companyManager")
public interface CompanyManager {
	
	public List<CompanyBean> companyManageList(CompanySearchBean companySearchBean);
	
	public String generateMngId();
	
	public void insertTbCompany(CompanyBean companyBean);
	
	public void deleteTbCompany(CompanySearchBean companySearchBean);
	
	public CompanyBean companyManageDetail(CompanySearchBean companySearchBean);
	
}