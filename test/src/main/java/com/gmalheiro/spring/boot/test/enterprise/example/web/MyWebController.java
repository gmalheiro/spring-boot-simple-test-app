package com.gmalheiro.spring.boot.test.enterprise.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gmalheiro.spring.boot.test.enterprise.example.business.BusinessService;

@Component
public class MyWebController {

	@Autowired
	private BusinessService businessService;

	public MyWebController(BusinessService businessService) {
		super();
		this.businessService = businessService;
	}
	
	public Long returnValueFromBusinessService () {
		return businessService.calculateSum();
	}
	
	
}