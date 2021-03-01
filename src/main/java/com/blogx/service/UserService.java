package com.blogx.service;

import com.blogx.entity.User;
import com.blogx.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface  UserService {
    List<User> findAll();
}
