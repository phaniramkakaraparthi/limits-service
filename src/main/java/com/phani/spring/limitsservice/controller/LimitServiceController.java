package com.phani.spring.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phani.spring.limitsservice.Configuration;
import com.phani.spring.limitsservice.bean.LimitsConfiguration;

@RestController
public class LimitServiceController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitsConfiguration getLimits() {
		return new LimitsConfiguration(configuration.getMinimum(),configuration.getMaximum());
	}
}
