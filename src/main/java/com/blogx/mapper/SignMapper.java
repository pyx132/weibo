package com.blogx.mapper;

import com.blogx.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value ="signMapper")
public interface SignMapper {

    User signIn(User user);
    Integer signUp(User user);
}
