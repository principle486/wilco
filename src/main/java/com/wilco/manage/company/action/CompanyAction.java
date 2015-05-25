package com.wilco.manage.company.action;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wilco.manage.company.service.CompanyManager;
import com.wilco.manage.global.beans.company.CompanyBean;
import com.wilco.manage.global.beans.company.CompanySearchBean;

@Controller
public class CompanyAction {
	
	private final static Logger logger = LoggerFactory.getLogger(CompanyAction.class);
	
	@Autowired
	private CompanyManager companyManager;
	@Autowired
	private CompanyBean companyBean;
	@Autowired
	private CompanySearchBean companySearchBean;
	@Autowired
	private List<CompanyBean> companyManageList;
	
	@RequestMapping(value="/company/companyManageList.wilco")
	public String companyManageList(@ModelAttribute("companySearchBean") CompanySearchBean companySearchBean , Model model) {
		
		model.addAttribute("pagingList" , companyManager.companyManageList(companySearchBean));
		
		return "company/companyManageList";
	}
	 
	@RequestMapping(value="/company/companyManageWrite.wilco")
	public String companyManageWrite(Model model) {
		String newCpMngId = "";
		
		newCpMngId = companyManager.generateMngId();
		
		model.addAttribute("newCpMngId" , newCpMngId);
		
		return "company/companyManageWrite";
	}
	
	@RequestMapping(value="/company/companyWriteAction.wilco" , method=RequestMethod.POST) 
	public String companyWriteAction(@ModelAttribute("companyBean") CompanyBean companyBean , Model model) {
		
		companyManager.insertTbCompany(companyBean);
		
		return "redirect:../company/companyManageList.wilco";
	}
	
	@RequestMapping(value="/company/companyDeleteAction.wilco" , method=RequestMethod.POST) 
	public String companyDeleteAction(@ModelAttribute("companySearchBean") CompanySearchBean companySearchBean , Model model) {
		
		companyManager.deleteTbCompany(companySearchBean);
		
		return "redirect:../company/companyManageList.wilco";
	}
	
	@RequestMapping(value="/company/companyManageDetail.wilco")
	public String companyManageDetail(@ModelAttribute("companySearchBean") CompanySearchBean companySearchBean , Model model){
		
		model.addAttribute("companyManageDetail" , companyManager.companyManageDetail(companySearchBean));
		
		return "company/companyManageDetail";
	}
	
	
	
}