package com.wo.map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class indexController {
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String getIndex() {
		return "index";
	}
	
	@RequestMapping(value="/map", method=RequestMethod.GET)
	public String getMap() {
		return "map/map";
	}

}
