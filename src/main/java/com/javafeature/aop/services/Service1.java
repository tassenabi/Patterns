package com.javafeature.aop.services;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Service1 {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	//private Repository1 repository1;

	//is a possible joint point
//	public String findSomething(){
//
//		String value = repository1.retrieveSomething();
//		logger.info("In Service 1 - {}", value);
//		return value;
//	}

	public void doNothing(){
		logger.info("Do Nothing Service 1 - {}");
	}
}