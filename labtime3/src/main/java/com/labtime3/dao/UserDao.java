package com.labtime3.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.labtime3.bean.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

}