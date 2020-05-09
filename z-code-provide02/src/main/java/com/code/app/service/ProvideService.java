package com.code.app.service;

import com.code.app.common.PageData;

public interface ProvideService {
	public Object get(PageData pd) throws Exception;
	
	public void trans(PageData pd) throws Exception;
}
