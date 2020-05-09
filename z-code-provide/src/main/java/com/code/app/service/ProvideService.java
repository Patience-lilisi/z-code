package com.code.app.service;

import com.code.app.common.PageData;

public interface ProvideService {
	public Object getProvide(PageData pd) throws Exception;
	
	public void tran(PageData pd) throws Exception;
}
