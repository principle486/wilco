package com.wilco.manage.sample.service;

import com.wilco.manage.sample.dao.SampleBean;
import com.wilco.manage.sample.dao.SampleDao;

public class SampleManagerImpl implements SampleManager {

	private SampleDao sampleDao;
	
	public void setSampleDao(SampleDao sampleDao) {
	  this.sampleDao = sampleDao;
	}
	
	public SampleBean doSomeBusinessStuff(String userId) {
	  return this.sampleDao.getUser(userId);
	}

}
