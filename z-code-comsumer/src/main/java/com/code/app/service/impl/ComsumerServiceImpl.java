package com.code.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.app.feign.ProvideService01;
import com.code.app.feign.ProvideService02;
import com.code.app.service.ComsumerService;

import io.seata.spring.annotation.GlobalTransactional;

@Service("ComsumerService")
public class ComsumerServiceImpl implements ComsumerService {
	@Autowired
	private ProvideService01 service01;

	@Autowired
	private ProvideService02 service02;

	@Override
	@GlobalTransactional(rollbackFor=Exception.class)
	public void trans() throws Exception{
		// TODO Auto-generated method stub
			service01.trans();
			service02.trans();
	}
}
