package com.code.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.app.common.PageData;
import com.code.app.service.AppService;

@RestController
public class AppController {

	@Autowired
	private AppService service;

	@RequestMapping(value = "/get")
	public Object get() throws Exception {
		return service.get();
	}

	@RequestMapping(value = "/up")
	public void up() {
		PageData pd = new PageData();
		pd.put("ids", "provide1");
		pd.put("name", "provide1");
		try {
			service.up(pd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}