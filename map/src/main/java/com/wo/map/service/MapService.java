package com.wo.map.service;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.wo.map.dao.MapDao;
import com.wo.map.domain.Map;

@Service
@MapperScan(basePackages = {"com.wo.map.dao"})
public class MapService {
	
	private MapDao dao;
	
	@Autowired
	SqlSessionTemplate template;
	
	// 거리 받아서 포인트로 변환하는 메서드
	public int getDistance(Map map, HttpServletRequest request) {
		int result = 0;
		int memIdx = (int) request.getSession().getAttribute("memIdx");
		String memName = (String) request.getSession().getAttribute("memName");
		int distance = map.getDistance();
		int point = Math.round(distance / 10);
		
		map.mapInfo(memIdx, memName, distance, point);
		
		try {
			dao = template.getMapper(MapDao.class);
			result = dao.insertInfo(map);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	

}
