package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.signUpRepo;
import com.entity.signUp;

@RestController
@RequestMapping("signUp")
@CrossOrigin(origins = "http://localhost:3000")

public class signUpController {

	@Autowired
	signUpRepo signUp;

	
	
	@PostMapping("/userSignUp")
	public ResponseEntity<Map<String, String>> contactReq(@RequestBody signUp sign) {  
		Map<String, String> response = new HashMap<>();
		response.put("message","User added Successfully");
		signUp.save(sign);
		 return ResponseEntity.ok(response);
	}
	@GetMapping("/getAll")
	public List<signUp> fetchAll(){
		return signUp.findAll();
	}
}
