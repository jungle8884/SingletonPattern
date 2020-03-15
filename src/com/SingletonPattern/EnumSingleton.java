package com.SingletonPattern;

/*
* 默认枚举实例的创建是线程安全的，并且在任何情况下都是单例。
* */
enum Singleton {
    INSTANCE;
}

/*
* 枚举的方式是比较少见的一种实现方式，但是看上面的代码实现，却更简洁清晰。
* 并且她还自动支持序列化机制，绝对防止多次实例化。
* */
public enum EnumSingleton{
    INSTANCE;

    public static EnumSingleton getInstance(){
        return EnumSingleton.INSTANCE;
    }
}