package com.SingletonPattern;

/*
* 懒汉式，顾名思义就是实例在用到的时候才去创建，“比较懒”，
* 用的时候才去检查有没有实例，
* 如果有则返回，没有则新建。
* 有线程安全和线程不安全两种写法，区别就是synchronized关键字。
* */
public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
