package com.wo.map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {
	
	@GetMapping("/")
	public String getIndex() {
		return "Index Page";
	}

}
