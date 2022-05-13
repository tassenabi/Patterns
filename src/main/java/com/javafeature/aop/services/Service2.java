package com.javafeature.aop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javafeature.aop.repositories.Repository2;

@Service
public class Service2 {
	
	@Autowired
	private Repository2 repository2;
	
	public String findSomething(){

		return repository2.retrieveSomething();
	}
}