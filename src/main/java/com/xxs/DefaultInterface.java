package com.xxs;

@FunctionalInterface
public interface DefaultInterface {
    //默认接口

    String  show(String msg);
    default void  eat(){
        System.out.println("eat");
    }
    default void  run(){
        System.out.println("run");
    }

}
