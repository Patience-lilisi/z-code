package com.code.app.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.code.app.common.PageData;

@FeignClient(value="provide01-config")
public interface ProvideService01 {
	
	@RequestMapping(value="/provide01")
	public PageData get();
	
	@RequestMapping(value="/provide01Tr")
	public void trans();
}
