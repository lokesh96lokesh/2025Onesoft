package com.Devopsjen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsjenController {
	
		@GetMapping("/get")
		public String getWord() {
			return "Hi loki u have successfully ran the devops project";
		}
}
