package com.linwl.startertest.service;

/**
 * @program: startertest
 * @description: 获取hashcode
 * @author: linwl
 * @create: 2020-09-03 09:33
 **/
public class GetHashCodeClass {

    private String targe;
    public GetHashCodeClass(String target){
        this.targe = target;
    }

    public String getHashCode(){
        return String.valueOf(this.targe.hashCode());
    }
}
