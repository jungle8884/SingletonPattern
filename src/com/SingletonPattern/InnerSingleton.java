package com.SingletonPattern;

/*
* 静态内部类的方式效果类似双检锁，但实现更简单。
* 但这种方式只适用于静态域的情况，
* 双检锁方式可在实例域需要延迟初始化时使用。
* */
public class InnerSingleton {

    private InnerSingleton(){}

    public static InnerSingleton getInstance(){
        return Inner.instance;
    }

    private static class Inner {
        private static final InnerSingleton instance = new InnerSingleton();
    }
}
