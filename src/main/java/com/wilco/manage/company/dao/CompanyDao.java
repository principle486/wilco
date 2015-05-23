package com.wilco.manage.company.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("companyDao")
public class CompanyDao {
	
	private final static Logger logger = Logger.getLogger(CompanyDao.class);
	
	@Autowired
	private SqlSession sqlSession;

	
	public String companyManageList(){
		logger.debug("call dao=>" + sqlSession);
		return sqlSession.selectOne("company-admin.companyManageList");
	}
	
	
	
}