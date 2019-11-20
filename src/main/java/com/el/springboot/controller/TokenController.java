package com.el.springboot.controller;

import com.el.springboot.service.TokenService;
import com.el.springboot.util.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author roman.zhang
 * @Date: 2019/8/27 14:14
 * @Version:V1.0
 * @Description:TokenController
 */
@RestController
@RequestMapping("/token")
public class TokenController {

    @Autowired
    private TokenService tokenService;

    @GetMapping
    public ServerResponse token(){
       return tokenService.createToken();
    }
}
