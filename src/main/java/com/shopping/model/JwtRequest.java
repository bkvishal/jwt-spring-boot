package com.shopping.model;

import java.io.Serializable;

/**
 * @author : Vishal Srivastava
 * @Date : 11-06-2019
 **/
public class JwtRequest implements Serializable {

    private static final long serialVersionUID = 5926468583005150707L;


    private String username;
    private String password;

    public JwtRequest() {

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
