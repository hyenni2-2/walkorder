package com.wo.map.domain;

import lombok.Data;

@Data
public class Map {
	
	private int idx;
	private int memIdx;
	private String memName;
	private int distance;
	private int point;
	
	public Map mapInfo(int memIdx, String memName, int distance, int point) {
		
		Map map = new Map();
		
		map.setMemIdx(memIdx);
		map.setMemName(memName);
		map.setDistance(distance);
		map.setPoint(point);
		
		return map;
	}

}
