package com.code.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.code.app.feign.ProvideService01;
import com.code.app.feign.ProvideService02;
import com.code.app.service.ComsumerService;

import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;

@Service("ComsumerService")
@Transactional(rollbackFor=Exception.class)
public class ComsumerServiceImpl implements ComsumerService {
	@Autowired
	private ProvideService01 service01;

	@Autowired
	private ProvideService02 service02;

	@Override
	@GlobalTransactional(rollbackFor=Exception.class)
	public void trans() {
		// TODO Auto-generated method stub
			String xid = RootContext.getXID();
			System.err.println("comsumer ----- "+xid);
			service01.trans();
			service02.trans();
			if(1==1) {
				throw new RuntimeException();
			}
	}
}
