package com.wilco.manage.company.action;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wilco.manage.company.service.CompanyManager;
import com.wilco.manage.global.beans.company.CompanyBean;

@Controller
public class CompanyAction {
	
	private final static Logger logger = Logger.getLogger(CompanyAction.class);
	
	@Autowired
	private CompanyManager companyManager;
	@Autowired
	private CompanyBean companyBean;
	
	@RequestMapping(value="/company/companyManageList.wilco" , method=RequestMethod.GET)
	public String companyManageList(){
		logger.debug("call action");
		String result = companyManager.companyManageList();
		logger.debug("result value==>" + result);
		return "/company/companyManageList";
	}
	 
	
}