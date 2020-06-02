package com.study.springboot01.entity;

import java.io.Serializable;

/**
 * 用户信息表(User)实体类
 *
 * @author makejava
 * @since 2020-06-01 16:29:44
 */
public class User implements Serializable {
    private static final long serialVersionUID = -78090694950760263L;
    
    private Integer id;
    
    private String username;
    
    private String password;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

}