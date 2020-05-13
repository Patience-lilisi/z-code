package com.code.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.app.common.PageData;
import com.code.app.mapper.AppMapper;
import com.code.app.service.AppService;

import io.seata.core.context.RootContext;
import io.seata.tm.api.GlobalTransactionContext;

@Service("AppService")
public class AppServiceImpl implements AppService{
	
	@Autowired
	private AppMapper mapper;

	@Override
	public PageData get() throws Exception {
		// TODO Auto-generated method stub
		return mapper.get();
	}

	@Override
	public void up(PageData pd) throws Exception {
		// TODO Auto-generated method stub
		String xid = RootContext.getXID();
		System.err.println(xid);
		RootContext.bind(xid);
		mapper.up(pd);
	}
	
}
