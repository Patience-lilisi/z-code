package com.code.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.app.common.PageData;
import com.code.app.feign.ProvideService01;
import com.code.app.feign.ProvideService02;
import com.code.app.service.ComsumerService;

@RestController
public class ComsumerController {
	
	@Autowired
	private ProvideService01 service01;
	
	@Autowired
	private ProvideService02 service02;
	
	@Autowired
	private ComsumerService service;
	
	@RequestMapping(value="/get")
	public Object gets(HttpServletRequest request) {
		PageData pd = new PageData(request);
//		PageData pd1 = service01.get();
//		PageData pd2 = service02.get();
//		pd.put("S01", pd1);
//		pd.put("S02", pd2);
		try {
			service.trans();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pd;
	}
}
