package com.wilco.manage.product.service;

import org.springframework.stereotype.Service;

import com.wilco.manage.global.beans.product.ProductBean;
import com.wilco.manage.global.beans.product.ProductSearchBean;
import com.wilco.manage.global.paging.Paging;

@Service("productManager")
public interface ProductManager {
	
	public Paging productManageList(ProductSearchBean productSearchBean);
	
	public String generateMngId();
	
	public void insertTbProduct(ProductBean productBean);
	
	public void deleteTbProduct(ProductSearchBean productSearchBean);
	
	public ProductBean productManageDetail(ProductSearchBean productSearchBean);
	
}