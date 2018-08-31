package com.project.AdminBackendService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
	@GetMapping("/validateAdmin/{name}/{pass}")
	public Boolean validate(@PathVariable("name") String name, @PathVariable("pass") String pass) {
		if(name.equals("admin")&&pass.equals("admin")) return true;
		else return false;
	}
}