package com.code.app.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.code.app.common.PageData;

@Mapper
public interface AppMapper {
	@Select("select * from tb_provide")
	public PageData get();
	
	@Update("update tb_provide set id = #{id},provide=#{name}")
	public void up(PageData pd);
}
