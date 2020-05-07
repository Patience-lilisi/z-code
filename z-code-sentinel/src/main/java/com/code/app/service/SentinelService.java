package com.code.app.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.code.app.service.impl.SentinelServiceImpl;

@FeignClient(value="nacos-config",fallback=SentinelServiceImpl.class)
public interface SentinelService {
	
	@RequestMapping(value="/")
	public String getPort();
}
