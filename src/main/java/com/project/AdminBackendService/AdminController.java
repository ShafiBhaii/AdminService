package com.project.AdminBackendService;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class AdminController {
	
	
	
	@GetMapping("/validateAdmin/{uname}/{pass}")
	public Boolean validate(@PathVariable("uname") String name, @PathVariable("pass") String pass) {
		if(name.equals("admin")&&pass.equals("admin")) return true;
		else return false;
		
	}
}
