package com.blogx.service;

import com.blogx.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SignService {

    User signIn(User user);

    Integer signUp(User user);
}
