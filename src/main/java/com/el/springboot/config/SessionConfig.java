package com.el.springboot.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @author roman.zhang
 * @Date: 2019/8/25 17:59
 * @Version:V1.0
 * @Description:SessionConfig
 */
@Configurable
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 60)
public class SessionConfig {
}
