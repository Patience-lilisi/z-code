package com.code.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.code.app.common.PageData;
import com.code.app.dao.Dao;
import com.code.app.service.ConfigService;


@Service("ConfigService")
@Transactional(rollbackFor=Exception.class)
public class ConfigServiceImpl implements ConfigService{
	
	@Autowired
	private Dao dao;

	@Override
	public Object senitel(PageData pd) throws Exception {
		// TODO Auto-generated method stub
		return dao.findForObject("DemoMapper.Demo", pd);
	}

	@Override
	public Object up(PageData pd) throws Exception {
		// TODO Auto-generated method stub
		return dao.update("DemoMapper.ups", pd);
	}

}
