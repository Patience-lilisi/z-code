package com.code.app.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.code.app.dao.Dao;


@Repository("Dao")
public class DaoImpl implements Dao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	public int save(String str, Object obj) throws Exception {
		return sqlSessionTemplate.insert(str, obj);
	}

	public int update(String str, Object obj) throws Exception {
		return sqlSessionTemplate.update(str, obj);
	}

	public int delete(String str, Object obj) throws Exception {
		return sqlSessionTemplate.delete(str, obj);
	}

	public int findForNum(String str, Object obj) throws Exception {
		Object o = sqlSessionTemplate.selectOne(str, obj);
		if (o != null) {
			String s = o.toString();
			return Integer.parseInt(s.substring(s.indexOf("=") + 1, s.length() - 1));
		}
		return 0;
	}

	public Object findForObject(String str, Object obj) throws Exception {
		return sqlSessionTemplate.selectOne(str, obj);
	}

	public Object findForList(String str, Object obj) throws Exception {
		return sqlSessionTemplate.selectList(str, obj);
	}
}
