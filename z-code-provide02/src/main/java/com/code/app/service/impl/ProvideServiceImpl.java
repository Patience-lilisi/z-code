package com.code.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.code.app.common.PageData;
import com.code.app.dao.Dao;
import com.code.app.service.ProvideService;

import io.seata.spring.annotation.GlobalTransactional;

@Service("ProvideService")
@Transactional(rollbackFor=Exception.class)
public class ProvideServiceImpl implements ProvideService {
	
	@Autowired
	private Dao dao;

	@Override
	public Object get(PageData pd) throws Exception {
		// TODO Auto-generated method stub
		return dao.findForObject("DemoMapper.get", pd);
	}

	@Override
	@GlobalTransactional
	public void trans(PageData pd) throws Exception {
		// TODO Auto-generated method stub
		dao.update("DemoMapper.ups", pd);
	}

}
