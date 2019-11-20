package com.el.springboot.controller;

import com.el.springboot.annotation.ApiIdempotent;
import com.el.springboot.service.TestService;
import com.el.springboot.service.TokenService;
import com.el.springboot.util.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author roman.zhang
 * @Date: 2019/8/27 14:19
 * @Version:V1.0
 * @Description:TestController
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @PostMapping
    @ApiIdempotent
    public ServerResponse testIdempotence(){
        return testService.testIdempotence();
    }
}
