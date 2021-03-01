package com.blogx.mapper;

import com.blogx.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component(value ="userMapper")
public interface UserMapper {

    List<User> findAll();

}
