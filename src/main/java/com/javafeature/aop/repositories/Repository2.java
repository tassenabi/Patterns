package com.javafeature.aop.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class Repository2 {

	public String retrieveSomething(){
		return "Data from Repositopy 2";
	}

}