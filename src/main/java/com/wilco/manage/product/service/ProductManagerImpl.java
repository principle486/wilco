package com.wilco.manage.product.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wilco.manage.global.beans.product.ProductBean;
import com.wilco.manage.global.beans.product.ProductSearchBean;
import com.wilco.manage.global.paging.Paging;
import com.wilco.manage.product.dao.ProductDao;


@Service("productManager")
public class ProductManagerImpl implements ProductManager {
	
	private final static Logger logger = Logger.getLogger(ProductManagerImpl.class);
	
	@Autowired
	private ProductDao productDao;
	
	
	public Paging productManageList(ProductSearchBean ProductSearchBean){
		List<ProductBean> list = productDao.productManageList(ProductSearchBean);
		int totalCount = productDao.productManageListTotalCount();
		int currentPage= Integer.parseInt(ProductSearchBean.getCurrentPage());
		int rowPerPage = Integer.parseInt(ProductSearchBean.getRowPerPage());
		logger.debug(totalCount +", " + currentPage + ", " + rowPerPage);
		return new Paging(list, totalCount , currentPage, rowPerPage);
		//return ProductDao.ProductManageList(ProductSearchBean);
		
	}
	
	public String generateMngId(){
		return productDao.generateMngId();
	}
	
	public void insertTbProduct(ProductBean ProductBean){
		try{
			productDao.insertTbProduct(ProductBean);
		}catch (Exception e) {
			// TODO: handle exception
			logger.debug("ProductManager.insertTbProduct : " + e.getMessage());
		}
	}
	
	public void deleteTbProduct(ProductSearchBean ProductSearchBean){
		try{
			String[] tempPdMngIds = ProductSearchBean.getPdMngIds();
			
			for(String pdMngId : tempPdMngIds){
				ProductSearchBean.setPdMngId(pdMngId);
				productDao.deleteTbProduct(ProductSearchBean);
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			logger.debug("ProductManager.deleteTbProduct : " + e.getMessage());
		}
	}
	
	public ProductBean productManageDetail(ProductSearchBean ProductSearchBean){
		return productDao.productManageDetail(ProductSearchBean);
	}
	
}