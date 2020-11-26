package com.labtime3.service;

import org.springframework.data.domain.Page;

import com.labtime3.bean.User;

public interface IUserService {
	Page<User> findAll(int page, int size);
}
