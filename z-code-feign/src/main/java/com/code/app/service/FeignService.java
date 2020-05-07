package com.code.app.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="nacos-config")
public interface FeignService {
	
	@RequestMapping(value="/")
	public String getPort();
}
