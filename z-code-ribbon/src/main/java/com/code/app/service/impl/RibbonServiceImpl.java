package com.code.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.code.app.common.PageData;
import com.code.app.dao.Dao;
import com.code.app.service.RibbonService;

@Service("RibbonService")
//@Transactional(rollbackFor=Exception.class)
public class RibbonServiceImpl implements RibbonService{
	
	@Autowired
	private Dao dao;
	
	@Override
	public Object ups(PageData pd) throws Exception {
		// TODO Auto-generated method stub
		return dao.update("DemoMapper.ups", pd);
	}

}
