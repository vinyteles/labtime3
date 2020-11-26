package com.labtime3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.labtime3.bean.User;
import com.labtime3.dao.UserDao;

@Service
public class UserService implements IUserService {

	@Autowired
	UserDao userDao;

	@Override
	public Page<User> findAll(int page, int size) {
		PageRequest pageRequest = PageRequest.of(page, size);
		return userDao.findAll(pageRequest);
	}

}
