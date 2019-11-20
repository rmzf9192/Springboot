package com.el.springboot.service;

import com.el.springboot.util.JedisUtil;
import com.el.springboot.util.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;
import java.util.UUID;

/**
 * @author roman.zhang
 * @Date: 2019/8/27 11:49
 * @Version:V1.0
 * @Description:TokenServiceImpl
 */
@Service
public class TokenServiceImpl implements TokenService {
    private static final String TOKEN_NAME="token";
    @Autowired
    private JedisUtil jedisUtil;

    @Override
    public ServerResponse createToken() {
        String uuid = UUID.randomUUID().toString();
        StringBuffer  token = new StringBuffer();
        token.append(uuid);
        jedisUtil.set(TOKEN_NAME,token.toString(),6000);

        return ServerResponse.success(token.toString());
    }

    @Override
    public void checkToken(HttpServletRequest request) {
        String token = request.getHeader(TOKEN_NAME);
        if(Objects.equals(token,null)){
            token = request.getParameter(TOKEN_NAME);
            if(StringUtils.isEmpty(token)){
                throw new SecurityException("参数不符合要求");
            }
        }

        if(!jedisUtil.exists(TOKEN_NAME)){
            System.out.println("redis不存在"+jedisUtil.get(TOKEN_NAME));
        }

        Long del = jedisUtil.del(TOKEN_NAME);

        System.out.println(del+"lllllll");
        System.out.println(jedisUtil.get(TOKEN_NAME));
        if(del <= 0){
            throw new SecurityException("redis数据，删除失败");
        }

    }
}
