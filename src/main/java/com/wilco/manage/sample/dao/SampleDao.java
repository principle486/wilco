package com.wilco.manage.sample.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface SampleDao {

	 @Select("SELECT * FROM users WHERE id = #{userId}")
	 SampleBean getUser(@Param("userId") String userId);
	
}
