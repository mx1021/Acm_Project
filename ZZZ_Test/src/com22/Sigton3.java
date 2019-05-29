package com22;

public class Sigton3
{
    //私有化构造方法
    private Sigton3() {
    }

    //提供个例子
    private static class StaticSigton

    {
        private static Sigton3 sigton = new Sigton3();
    }

    //提供外部静态方法
    public static Sigton3 getInstance() {
        return StaticSigton.sigton;
    }

}
