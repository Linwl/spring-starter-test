package com.linwl.startertest.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @program: startertest
 * @description: 配置文件读取类
 * @author: linwl
 * @create: 2020-09-03 09:33
 **/
@ConfigurationProperties("target.string")
public class AutoConfigruationProperties {
    private String target;

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}
