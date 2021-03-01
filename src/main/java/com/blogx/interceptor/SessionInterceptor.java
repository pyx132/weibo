package com.blogx.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class SessionInterceptor implements HandlerInterceptor {
    @Override
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {
    }

    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
            throws Exception {
    }

    @Override
    public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
        //普通路径放行
        System.out.println("preHandle:" + arg0.getRequestURI());
        if ("/sign-in.html".equals(arg0.getRequestURI()) || "/sign-up.html".equals(arg0.getRequestURI())) {
            return true;
        }
        //权限路径拦截
        Object object = arg0.getSession().getAttribute("user");
        if (null == object) {
            arg1.sendRedirect("/sign-in.html");
            return false;
        }else{
            return true;
        }
    }
}
