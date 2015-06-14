package com.wilco.manage.product.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wilco.manage.global.beans.product.ProductBean;
import com.wilco.manage.global.beans.product.ProductSearchBean;


@Component("productDao")
public class ProductDao {
	
	private final static Logger logger = Logger.getLogger(ProductDao.class);
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<ProductBean> productManageList(ProductSearchBean productSearchBean){
		return sqlSession.selectList("product-admin.productManageList" , productSearchBean);
	}
	
	public int productManageListTotalCount(){
		int totalCount = sqlSession.selectOne("product-admin.productManageListTotalCount");
		return totalCount;
	}
	
	public String generateMngId(){
		return sqlSession.selectOne("product-admin.generateMngId");
	}
	
	public void insertTbProduct(ProductBean productBean){
		try{
			sqlSession.insert("product-admin.insertTbproduct", productBean);
		}catch (Exception e) {
			// TODO: handle exception
			logger.debug("product-admin.insertTbproduct : " + e.getMessage());
		}	
	}
	
	public void deleteTbProduct(ProductSearchBean productSearchBean){
		try{
			sqlSession.update("product-admin.deleteTbproduct" , productSearchBean);
		}catch (Exception e) {
			// TODO: handle exception
			logger.debug("product-admin.deleteTbproduct : " + e.getMessage());
		}
	}
	
	public ProductBean productManageDetail(ProductSearchBean productSearchBean){
		return sqlSession.selectOne("product-admin.productManageDetail" , productSearchBean);
	}
	
	
}