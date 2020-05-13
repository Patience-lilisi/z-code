package com.code.app.service;

import com.code.app.common.PageData;

public interface AppService {
	public PageData get() throws Exception;

	public void up(PageData pd) throws Exception;
}
