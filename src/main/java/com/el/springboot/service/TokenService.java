package com.el.springboot.service;

import com.el.springboot.util.ServerResponse;

import javax.servlet.http.HttpServletRequest;

/**
 * @author roman.zhang @Date: 2019/8/27 11:48 @Version:V1.0 @Description:TokenService
 */
public interface TokenService {
    public ServerResponse createToken();

    public void checkToken(HttpServletRequest request);
}
