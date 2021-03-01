package com.blogx.entity;

import java.util.Date;
public class User {
    private Integer userId;
    private String username;
    private String password;
    private String nickName;
    private String face;
    private Integer sex;
    private Date bir;
    private String province;
    private String city;

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    private int phone;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickName='" + nickName + '\'' +
                ", face='" + face + '\'' +
                ", sex=" + sex +
                ", bir=" + bir +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBir() {
        return bir;
    }

    public void setBir(Date bir) {
        this.bir = bir;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
