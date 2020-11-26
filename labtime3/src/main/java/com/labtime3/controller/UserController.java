package com.labtime3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.labtime3.bean.User;
import com.labtime3.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
    private IUserService userService;

	@GetMapping
    public List<User> listUsers(@RequestParam(
            value = "page",
            required = false,
            defaultValue = "0") int page,
    @RequestParam(
            value = "size",
            required = false,
            defaultValue = "10") int size) {      
    	return userService.findAll(page, size).getContent();
    }
}
