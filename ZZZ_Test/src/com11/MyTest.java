package com11;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.Test;

public class MyTest
{
    @Test
    public void test1() {

        Integer a = 1;
        Integer b = 131;
        swap(a, b);
        System.out.println(a + "|" + b);

        Integer aa = 127;
        Integer bb = 127;
        System.out.println(aa == bb);
    }

    public void swap(Integer a, Integer b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + "|" + b);
    }

    @Test
    public void test16点21分() {
        new class16点22分();
    }

    class class16点22分
    {

        {
            System.out.println("带啊模块");
        }

        public class16点22分() {
            System.out.println("构造器");
        }
    }

    @Test
    public void test09点37分() {
        new Thread(new Runnable()
        {
            @Override
            public void run() {
                System.out.println("aaa");
            }
        }).start();
    }

    @Test
    public void test09点55分() {
        System.out.println(Math.round(-3.5));
        System.out.println(new BigDecimal(3.55).setScale(1, BigDecimal.ROUND_HALF_UP));
        System.out.println(Math.ceil(1));
    }

    @Test
    public void test14点30分() {
        String str1 = "通话";
        String str2 = "通信";
        System.out.println(str1.hashCode() + "|" + str2.hashCode());
    }
}
