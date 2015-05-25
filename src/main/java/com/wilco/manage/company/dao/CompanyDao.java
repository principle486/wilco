package com.wilco.manage.company.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wilco.manage.global.beans.company.CompanyBean;
import com.wilco.manage.global.beans.company.CompanySearchBean;


@Component("companyDao")
public class CompanyDao {
	
	private final static Logger logger = Logger.getLogger(CompanyDao.class);
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<CompanyBean> companyManageList(CompanySearchBean companySearchBean){
		return sqlSession.selectList("company-admin.companyManageList" , companySearchBean);
	}
	
	public int companyManageListTotalCount(){
		int totalCount = sqlSession.selectOne("company-admin.companyManageListTotalCount");
		return totalCount;
	}
	
	public String generateMngId(){
		return sqlSession.selectOne("company-admin.generateMngId");
	}
	
	public void insertTbCompany(CompanyBean companyBean){
		try{
			sqlSession.insert("company-admin.insertTbCompany", companyBean);
		}catch (Exception e) {
			// TODO: handle exception
			logger.debug("company-admin.insertTbCompany : " + e.getMessage());
		}	
	}
	
	public void deleteTbCompany(CompanySearchBean companySearchBean){
		try{
			sqlSession.update("company-admin.deleteTbCompany" , companySearchBean);
		}catch (Exception e) {
			// TODO: handle exception
			logger.debug("company-admin.deleteTbCompany : " + e.getMessage());
		}
	}
	
	public CompanyBean companyManageDetail(CompanySearchBean companySearchBean){
		return sqlSession.selectOne("company-admin.companyManageDetail" , companySearchBean);
	}
	
	
}