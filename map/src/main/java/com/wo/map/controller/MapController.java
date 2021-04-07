package com.wo.map.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.wo.map.domain.Map;
import com.wo.map.service.MapService;

@Controller
public class MapController {
	
	@Autowired
	MapService service;
	
	// 거리 받는 메서드
	@PostMapping("/map/distance")
	public String getDistanceNum(@ModelAttribute("map") Map map, HttpServletRequest request,Model model) {
		System.out.println("map distance" + map.getDistance());
		System.out.println("map memIdx" + map.getMemIdx());
		System.out.println("map point" + map.getPoint());
		// 결과 값 저장
		int result = service.getDistance(map,request);
		model.addAttribute("result", result);
		
		return "map/distance";
	}
	
	
	
}
