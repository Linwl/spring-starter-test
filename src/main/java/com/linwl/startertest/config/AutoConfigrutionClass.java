package com.linwl.startertest.config;

import com.linwl.startertest.service.GetHashCodeClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: startertest
 * @description: 自动装配类
 * @author: linwl
 * @create: 2020-09-03 09:35
 **/
@Configuration
@EnableConfigurationProperties(AutoConfigruationProperties.class)
@ConditionalOnClass(GetHashCodeClass.class)
public class AutoConfigrutionClass {

    @Autowired
    private AutoConfigruationProperties autoConfigruationProperties;

    @ConditionalOnMissingBean
    @Bean
    public GetHashCodeClass getHashCodeClass(){
        return new GetHashCodeClass(autoConfigruationProperties.getTarget());
    }
}
