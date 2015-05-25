package com.wilco.manage.company.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wilco.manage.company.dao.CompanyDao;
import com.wilco.manage.global.beans.company.CompanyBean;
import com.wilco.manage.global.beans.company.CompanySearchBean;
import com.wilco.manage.global.paging.Paging;


@Service("companyManager")
public class CompanyManagerImpl implements CompanyManager {
	
	private final static Logger logger = Logger.getLogger(CompanyManagerImpl.class);
	
	@Autowired
	private CompanyDao companyDao;
	
	
	public List<CompanyBean> companyManageList(CompanySearchBean companySearchBean){
		/*List<CompanyBean> list = companyDao.companyManageList(companySearchBean);
		int totalCount = companyDao.companyManageListTotalCount();
		int currentPage= Integer.parseInt(companySearchBean.getCurrentPage());
		int rowPerPage = Integer.parseInt(companySearchBean.getRowPerPage());
		
		return new Paging(list, totalCount , currentPage, rowPerPage);*/
		return companyDao.companyManageList(companySearchBean);
		
	}
	
	public String generateMngId(){
		return companyDao.generateMngId();
	}
	
	public void insertTbCompany(CompanyBean companyBean){
		try{
			companyDao.insertTbCompany(companyBean);
		}catch (Exception e) {
			// TODO: handle exception
			logger.debug("companyManager.insertTbCompany : " + e.getMessage());
		}
	}
	
	public void deleteTbCompany(CompanySearchBean companySearchBean){
		try{
			String[] tempCpMngIds = companySearchBean.getCpMngIds();
			
			for(String cpMngId : tempCpMngIds){
				companySearchBean.setCpMngId(cpMngId);
				companyDao.deleteTbCompany(companySearchBean);
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			logger.debug("companyManager.deleteTbCompany : " + e.getMessage());
		}
	}
	
	public CompanyBean companyManageDetail(CompanySearchBean companySearchBean){
		return companyDao.companyManageDetail(companySearchBean);
	}
}