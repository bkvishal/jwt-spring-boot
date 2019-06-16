package com.shopping.model;

import java.io.Serializable;

/**
 * @author : Vishal Srivastava
 * @Date : 11-06-2019
 **/

public class JwtResponse implements Serializable {

    private static final long serialVersionUID = -8091879091924046844L;

    private String token;

    public JwtResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
