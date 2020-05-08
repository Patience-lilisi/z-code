package com.code.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.code.app.common.PageData;
import com.code.app.service.RibbonService;

@RestController
public class RibbonController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private RibbonService service;

	@RequestMapping(value = "/ribbon")
	public Object ribbon(HttpServletRequest request) {
		return restTemplate.getForObject("http://nacos-config", String.class);
	}

	@RequestMapping(value = "/excs")
	public Object excs() throws Exception {
		PageData pd = new PageData();
		pd.put("ids", "123123");
		pd.put("name", "lilisi");
		service.ups(pd);
		return "lli";
	}
}
