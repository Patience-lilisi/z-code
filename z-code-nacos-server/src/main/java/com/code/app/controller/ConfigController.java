package com.code.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.app.common.PageData;
import com.code.app.service.ConfigService;

@RestController
@RefreshScope
public class ConfigController {

	@Value("${user.name}")
	private String name;
	@Value("${user.age}")
	private String age;

	@Autowired
	private ConfigService service;

	@RequestMapping(value = "/config")
	public Object config(HttpServletRequest request) {
		PageData pd = new PageData(request);
		return name + "----" + age;
	}

	@RequestMapping(value = "/senitel")
	public Object sennitel(HttpServletRequest request) {
		PageData pd = new PageData(request);
		try {
			pd = (PageData) service.senitel(pd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pd;
	}

	@RequestMapping(value = "/senitelTran")
	public Object tran(HttpServletRequest request) throws Exception {
		PageData pd = new PageData(request);
		pd.put("id", "111111");
		pd.put("name", "22222");
		service.up(pd);
		return "修改成功";
	}
}
