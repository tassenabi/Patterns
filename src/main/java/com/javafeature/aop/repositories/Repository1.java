package com.javafeature.aop.repositories;
import org.springframework.stereotype.Repository;

@Repository
public class Repository1 {
	
	public String retrieveSomething(){
		return "Data from Repository 1";
	}

}