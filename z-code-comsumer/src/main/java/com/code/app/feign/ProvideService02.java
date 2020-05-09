package com.code.app.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.code.app.common.PageData;

@FeignClient(value = "provide02-config")
public interface ProvideService02 {

	@RequestMapping(value = "/provide02")
	public PageData get();

	@RequestMapping(value = "/provide02Tr")
	public void trans();
}
