package com.code.app.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.app.common.PageData;


@RestController
@RefreshScope
public class ConfigController {
	
	@Value("${user.name}")
	private String name;
	@Value("${user.age}")
	private String age;

	@RequestMapping(value = "/config")
	public Object config(HttpServletRequest request) {
		PageData pd = new PageData(request);
		return name + "----" + age;
	}
}
