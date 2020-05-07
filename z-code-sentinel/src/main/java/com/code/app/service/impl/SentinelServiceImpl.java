package com.code.app.service.impl;

import org.springframework.stereotype.Component;

import com.code.app.service.SentinelService;

@Component
public class SentinelServiceImpl implements SentinelService {

	@Override
	public String getPort() {
		// TODO Auto-generated method stub
		return "服务未启动";
	}

}
