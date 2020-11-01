package com.mani.demoforcloudsql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/users")
public class UserController {

	@Autowired UserRepo userRepo;
	
	
	@PostMapping
	public AppUsers insertUser(@RequestBody AppUsers appUser) {
		return userRepo.save(appUser);
	}
	
	@GetMapping
	public List<AppUsers> getAllUsers(){
		return userRepo.findAll();
	}
	
	@DeleteMapping(value = "{id}")
	public int deleteById(int id) {
		userRepo.deleteById(id);
		return 1;
	}
}
