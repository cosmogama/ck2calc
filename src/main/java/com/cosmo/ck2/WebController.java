package com.cosmo.ck2;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class WebController {

	@RequestMapping("/")
	public String test(){
		return "Crusader Kings II calculator coming soon.  Check out the <a href='https://github.com/cosmogama/ck2calc'>github</a> page for more information.";
	}
}
