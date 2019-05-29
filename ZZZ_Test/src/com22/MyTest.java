package com22;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MyTest
{
    @Test
    public void test17点47分() {
        Sigton1 sigton = Sigton1.getInstance();
        sigton.say();

        Sigton1 sigton2 = Sigton1.getInstance();
        System.out.println((sigton == sigton2) + "|" + sigton);
        sigton = null;
        sigton = Sigton1.getInstance();
        System.out.println(sigton);
    }

    @Test
    public void test15点49分() {
        List<Integer> lists = new ArrayList<Integer>();
        lists.add(1);
        lists.add(2);
        lists.add(3);
        lists.add(4);
        lists.add(5);
        int size = lists.size();
        for (int i = 0; i < size; i++) {
            System.out.println(i + "|" + lists.get(i));
            if (3 == lists.get(i) || 4 == lists.get(i)) {
                lists.remove(i); //lists.remove(lists.get(i));
                //System.out.println("111");
            }
        }
        System.out.println(lists); // 打印[1, 2, 4, 5] 此时会将4忽略掉

    }

    @Test
    public void test16点14分() {
        new Thread(new Runnable()
        {
            public void run() {
                Sigton2 s = Sigton2.getInstance();
                System.out.println(s);
            }
        }).start();

        new Thread(new Runnable()
        {
            public void run() {
                Sigton2 s = Sigton2.getInstance();
                System.out.println(s);
            }
        }).start();
    }

    @Test
    public void test09点24分() throws CloneNotSupportedException {
        String[] ceshi = {"1", "2" };
        KeLong a = new KeLong("MX", ceshi);
        KeLong b = a.clone();
        b.name = "1";
        System.out.println(a.name);
        System.out.println(b.getGirls()[0]);
    }

    @Test
    public void test11点34分() throws UnsupportedEncodingException {
        String a = "aa啊";
        a = URLEncoder.encode(a, "UTF-8");
        System.out.println(a);
    }
}
