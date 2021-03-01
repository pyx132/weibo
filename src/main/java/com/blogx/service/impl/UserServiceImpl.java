package com.blogx.service.impl;

import com.blogx.entity.User;
import com.blogx.mapper.SignMapper;
import com.blogx.mapper.UserMapper;
import com.blogx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}