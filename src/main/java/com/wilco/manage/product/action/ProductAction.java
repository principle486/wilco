package com.wilco.manage.product.action;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wilco.manage.global.beans.product.ProductBean;
import com.wilco.manage.global.beans.product.ProductSearchBean;
import com.wilco.manage.product.service.ProductManager;

@Controller
public class ProductAction {
	
	private final static Logger logger = LoggerFactory.getLogger(ProductAction.class);
	
	@Autowired
	private ProductManager productManager;
	@Autowired
	private ProductBean productBean;
	@Autowired
	private ProductSearchBean productSearchBean;
	@Autowired
	private List<ProductBean> productManageList;
	
	@RequestMapping(value="/product/productManageList.wilco")
	public String productManageList(@ModelAttribute("productSearchBean") ProductSearchBean productSearchBean , Model model) {
		
		model.addAttribute("pagingList" , productManager.productManageList(productSearchBean));
		
		return "product/productManageList";
	}
	 
	@RequestMapping(value="/product/productManageWrite.wilco")
	public String productManageWrite(Model model) {
		String newPdMngId = "";
		
		newPdMngId = productManager.generateMngId();
		
		model.addAttribute("newPdMngId" , newPdMngId);
		
		return "product/productManageWrite";
	}
	
	@RequestMapping(value="/product/productWriteAction.wilco" , method=RequestMethod.POST) 
	public String productWriteAction(@ModelAttribute("productBean") ProductBean productBean , Model model) {
		
		productManager.insertTbProduct(productBean);
		
		return "redirect:../product/productManageList.wilco";
	}
	
	@RequestMapping(value="/product/productDeleteAction.wilco" , method=RequestMethod.POST) 
	public String productDeleteAction(@ModelAttribute("productSearchBean") ProductSearchBean productSearchBean , Model model) {
		
		productManager.deleteTbProduct(productSearchBean);
		
		return "redirect:../product/productManageList.wilco";
	}
	
	@RequestMapping(value="/product/productManageDetail.wilco")
	public String productManageDetail(@ModelAttribute("productSearchBean") ProductSearchBean productSearchBean , Model model){
		
		model.addAttribute("productManageDetail" , productManager.productManageDetail(productSearchBean));
		
		return "product/productManageDetail";
	}
	
	
	
}