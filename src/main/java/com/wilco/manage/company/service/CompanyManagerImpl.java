package com.wilco.manage.company.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wilco.manage.company.action.CompanyAction;
import com.wilco.manage.company.dao.CompanyDao;


@Service("companyManager")
public class CompanyManagerImpl implements CompanyManager {
	
	private final static Logger logger = Logger.getLogger(CompanyManagerImpl.class);
	
	@Autowired
	private CompanyDao companyDao;
	
	
	public String companyManageList(){
		logger.debug("call service");
		return companyDao.companyManageList();
	}
}