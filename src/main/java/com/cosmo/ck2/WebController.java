package com.cosmo.ck2;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class WebController {

	@RequestMapping("/")
	public String test(){
		return "test";
	}
}
