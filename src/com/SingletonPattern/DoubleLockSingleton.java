package com.SingletonPattern;

/*
* 双检锁，又叫双重校验锁，综合了懒汉式和饿汉式两者的优缺点整合而成。
* 看下面代码实现中，特点是在synchronized关键字内外都加了一层 if 条件判断，
* 这样既保证了线程安全，又比直接上锁提高了执行效率，还节省了内存空间。
* */
public class DoubleLockSingleton {
    /*
    * 由于 DoubleLockSingleton instance 对象的创建在JVM中可能会进行重排序，
    * 在多线程访问下存在风险，使用 volatile 修饰 instance 实例变量有效，解决该问题。
    */
    private volatile static DoubleLockSingleton instance;

    private  DoubleLockSingleton(){}
    //双重检查模式，进行了两次的判断
    public static DoubleLockSingleton getInstance(){
        //第一次检查是避免不必要的上锁
        if(instance == null){
            synchronized (DoubleLockSingleton.class){
                //第二次检查是：在给当前线程加锁后，例行检查
                if(instance == null){
                    instance = new DoubleLockSingleton();
                }
            }
        }

        return instance;
    }
}
