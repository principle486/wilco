package com.wilco.manage.sample.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wilco.manage.sample.service.SampleManager;

@Controller
public class SampleAction {
	private static final Logger logger = LoggerFactory.getLogger(SampleAction.class);
	
	private SampleManager sampleManager;

	public void setSampleManager(SampleManager sampleManager) {
		  this.sampleManager = sampleManager;
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/sample", method = RequestMethod.GET )
	public String main() {
		String userId = "principle486";
		sampleManager.doSomeBusinessStuff(userId);
		return "sample";
	}
	
}
