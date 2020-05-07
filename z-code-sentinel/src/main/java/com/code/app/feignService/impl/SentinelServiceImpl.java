package com.code.app.feignService.impl;

import org.springframework.stereotype.Component;

import com.code.app.feignService.SentinelService;

@Component
public class SentinelServiceImpl implements SentinelService {

	@Override
	public String getPort() {
		// TODO Auto-generated method stub
		return "服务未启动";
	}

}
