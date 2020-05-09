package com.code.app.dao;

public interface Dao {
	public int save(String str, Object obj) throws Exception;

	public int update(String str, Object obj) throws Exception;

	public int delete(String str, Object obj) throws Exception;

	public int findForNum(String str, Object obj) throws Exception;

	public Object findForObject(String str, Object obj) throws Exception;

	public Object findForList(String str, Object obj) throws Exception;
}
