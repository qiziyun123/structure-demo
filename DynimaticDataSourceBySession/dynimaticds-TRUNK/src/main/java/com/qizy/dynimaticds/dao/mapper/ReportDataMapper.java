package com.qizy.dynimaticds.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.qizy.dynimaticds.entity.ReportDataEntity;

public interface ReportDataMapper {
	@ResultMap(value = "BaseResultMap")
	@Select("SELECT * FROM reportdata WHERE  data_id = #{id}")
	List<ReportDataEntity> selectById(Long id);

	@ResultMap(value = "BaseResultMap")
	@Select("SELECT * FROM reportdata WHERE  user_id = #{userId}")
	List<ReportDataEntity> selectByUserId(String userId);
}
