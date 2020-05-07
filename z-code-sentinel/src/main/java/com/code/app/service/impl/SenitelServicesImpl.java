package com.code.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.app.feignService.Senitel01Service;
import com.code.app.feignService.SentinelService;
import com.code.app.service.SenitelServices;

import io.seata.spring.annotation.GlobalTransactional;

@Service(value = "SenitelServices")
public class SenitelServicesImpl implements SenitelServices {
	
	@Autowired
	private SentinelService service;
	
	@Autowired
	private Senitel01Service service01;

	@Override
	@GlobalTransactional(rollbackFor=Exception.class)
	public void Global() {
		// TODO Auto-generated method stub
		service.getPort();
		service01.ups();
	}

}
