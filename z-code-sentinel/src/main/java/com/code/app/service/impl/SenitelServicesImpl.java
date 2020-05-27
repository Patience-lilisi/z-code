package com.code.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.code.app.service.SenitelServices;

@Service(value = "SenitelServices")
public class SenitelServicesImpl implements SenitelServices {
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Object Global() {
		// TODO Auto-generated method stub
		restTemplate.getForObject("http://nacos-config/senitelTran", String.class);
		restTemplate.getForObject("http://ribbon-config/excs", String.class);
		return "lilisi";
	}

}
