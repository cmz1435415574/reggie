package com.itheima.reggie.common;

/**
 * 自定义业务一场
 */
public class CustomException extends RuntimeException{
    public CustomException(String message){
        super(message);
    }
}
