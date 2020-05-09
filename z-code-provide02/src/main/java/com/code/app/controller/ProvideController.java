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

	@RequestMapping(value = "/provide02")
	public Object provide(HttpServletRequest request) {
		PageData pd = new PageData(request);
		try {
			pd = (PageData) service.get(pd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "/provide02Tr")
	public void provide02Tr(HttpServletRequest request) throws Exception {
		PageData pd = new PageData(request);
		pd.put("ids", "idss");
		pd.put("names", "lilisi");
		service.trans(pd);
	}
}
