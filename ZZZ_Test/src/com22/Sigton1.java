package com22;

public class Sigton1
{
    //1.构造器私有化
    private Sigton1() {
    }

    //2.提供静态实体类
    private static Sigton1 sigton = new Sigton1();

    //3.提供外部获取的方法
    static Sigton1 getInstance() {
        return sigton;
    }

    public void say() {
        System.out.println("hello world");
    }

}
