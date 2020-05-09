package com.code.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.app.common.PageData;
import com.code.app.service.ProvideService;

@RestController
public class ProvideController {
	
	@Autowired
	private ProvideService service;
	
	@RequestMapping(value="/provide01")
	public Object provide01(HttpServletRequest request) throws Exception {
		PageData pd = new PageData(request);
		pd = (PageData) service.getProvide(pd);
		return pd;
	}
	
	@RequestMapping(value="/provide01Tr")
	public void provide01Tr(HttpServletRequest request) throws Exception {
		PageData pd = new PageData(request);
		pd.put("id", "provide01");
		pd.put("name", "provide01");
		service.tran(pd);
	}
}
