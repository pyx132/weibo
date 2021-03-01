package com.blogx.service.impl;

import com.blogx.entity.User;
import com.blogx.mapper.SignMapper;
import com.blogx.service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("signService")
public class SignServiceImpl implements SignService {

    @Autowired
    private SignMapper signMapper;


    @Override
    public User signIn(User user) {
        return signMapper.signIn(user);
    }

    @Override
    public Integer signUp(User user) {
        return signMapper.signUp(user);
    }
}