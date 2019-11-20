package com.el.springboot.util;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author roman.zhang
 * @Date: 2019/8/27 11:56
 * @Version:V1.0
 * @Description:ServerResponse
 */
@AllArgsConstructor
@Data
public class ServerResponse implements Serializable {
    /**
     * 提示信息
     */
    private String message;

    public static ServerResponse success(String msg){
        return new ServerResponse(msg);

    }
}
