package com.blogx.controller;

import com.blogx.entity.User;
import com.blogx.mapper.SignMapper;
import com.blogx.service.SignService;
import com.blogx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.resource.HttpResource;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@RestController
public class SignController {

    @Autowired
    private SignService signService;

    @RequestMapping(value = "/sign_in",method = RequestMethod.POST)
    @ResponseBody
    public String signIn(User user, HttpSession session, HttpServletResponse response) throws IOException {
        User users = signService.signIn(user);
        if (users!=null){
            session.setAttribute("user",user);
            System.out.println("登录成功");
            return "success";
        }
        return "failed";
    }
    @RequestMapping(value = "/sign_up",method = RequestMethod.POST)
    public String signUp(User user, HttpSession session){
        Integer result = signService.signUp(user);
        if (result!=0){
            session.setAttribute("user",user);
            return "success";
        }else{
            return "failed";
        }
    }
}
