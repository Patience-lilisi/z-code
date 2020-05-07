package com.code.app.feignService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.code.app.feignService.impl.SentinelServiceImpl;

@FeignClient(value = "nacos-config", fallback = SentinelServiceImpl.class)
public interface SentinelService {

	@RequestMapping(value = "/senitel")
	public String getPort();
}
