package com.wo.map.dao;

import org.apache.ibatis.annotations.Mapper;

import com.wo.map.domain.Map;

@Mapper
public interface MapDao {
	
	// 거리 저장하는 메서드
	int insertInfo(Map map);

}
