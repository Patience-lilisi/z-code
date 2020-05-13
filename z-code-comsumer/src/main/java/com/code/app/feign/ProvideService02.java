package com.code.app.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.code.app.common.PageData;

@FeignClient(value = "mapperdb02-config")
public interface ProvideService02 {

	@RequestMapping(value = "/provide02")
	public PageData get();

	@RequestMapping(value = "/up")
	public void trans();
}
