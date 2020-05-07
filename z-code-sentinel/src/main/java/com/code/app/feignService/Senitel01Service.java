package com.code.app.feignService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.code.app.feignService.impl.Senitel01ServiceImpl;

@FeignClient(value = "ribbon-config", fallback = Senitel01ServiceImpl.class)
public interface Senitel01Service {
	
	@RequestMapping(value="/excs")
	public void ups();
}
