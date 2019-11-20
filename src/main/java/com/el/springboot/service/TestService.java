package com.el.springboot.service;

import com.el.springboot.util.ServerResponse;

/**
 * @author roman.zhang
 * @Date: 2019/8/27 14:23
 * @Version:V1.0
 * @Description:TestService
 */
public interface TestService {

    public ServerResponse testIdempotence();
}
