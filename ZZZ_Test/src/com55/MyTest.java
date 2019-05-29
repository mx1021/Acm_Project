package com55;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.axis.encoding.Base64;
import org.junit.Test;

public class MyTest
{
    @Test //base64加密算法
    public void mxTest16时34分() throws UnsupportedEncodingException {
        String aa = Base64.encode("猫".getBytes("UTF-8"));
        System.out.println(aa);
        System.out.println(new String(Base64.decode(aa), "utf-8"));
    }

    @Test
    public void mxTest20时07分() {
        ExecutorService pool = Executors.newFixedThreadPool(1);
        pool.submit(new Thread(new Runnable()
        {

            @Override
            public void run() {
                Thread.currentThread().setName("T1");
                System.out.println("1");

            }
        }));

        pool.submit(new Thread(new Runnable()
        {

            @Override
            public void run() {
                Thread.currentThread().setName("T2");
                System.out.println("2");

            }
        }));
        pool.shutdown();

    }

    @Test
    public void mxTest20时19分() {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            try {
                Thread.sleep(index * 1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            cachedThreadPool.submit(new Runnable()
            {
                public void run() {
                    System.out.println(index);
                }
            });
        }

    }

    @Test
    public void mxTest20时22分() {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(1);
        for (int i = 0; i < 10; i++) {
            final int index = i;
            fixedThreadPool.execute(new Runnable()
            {
                public void run() {
                    try {
                        System.out.println(index);
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    @Test
    public void mxTest21时03分() {
        //模拟死锁
        Object obj1 = new Object();
        Object obj2 = new Object();

        new Thread(new Runnable()
        {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                synchronized (obj1) {
                    System.out.println("1111");
                    try {
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    synchronized (obj2) {
                        System.out.println("aaaa");
                    }
                }
            }
        }).start();
        new Thread(new Runnable()
        {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                synchronized (obj2) {
                    System.out.println("2222");
                    synchronized (obj1) {
                        System.out.println("bbbb");
                    }
                }
            }
        }).start();

    }

    @Test
    public void mxTest21时55分() {
        A c = new C();
    }

    @Test
    public void mxTest11时13分() {
        if ((1 / 0 == 0) && 1 == 0) {
            System.out.println("11");
        }
        else {
            System.out.println("22");

        }
    }

    @Test
    public void mxTest23时09分() {
        final List<String> lst = new ArrayList<>();
        lst.add("1");
    }

    @Test
    public void mxTest09时33分() {
        TreeSet<People> set = new TreeSet<>();
        set.add(new People("b", 1));
        // set.add(new People("a", 1));
        set.add(new People("b", 2));
        set.add(new People("c", 3));
        Iterator<People> i = set.iterator();
        while (i.hasNext()) {
            People aaa = (People) i.next();
            System.out.println(aaa.name + aaa.age);
        }

    }

    @Test
    public void mxTest10时20分() {
        TreeSet set = new TreeSet<>();
        set.add("1");
        set.add("-1");
        set.add("3");

        for (Object object : set) {
            System.out.println(object);
        }
    }

    @Test
    public void mxTest11时18分() {
        Set set = new HashSet<>();
        People p = new People("1", 1);
        People.man m = p.new man();
        set.add("");
    }

    @Test
    public void mxTest11时27分() {
        TreeMap map = new TreeMap<>();
        map.put("1", "1");
        map.put("1", "2");
        map.put("", null);
        System.out.println(map.get("1"));
    }

    @Test
    public void mxTest18时04分() {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "1");
        Set<Entry<String, String>> entrySet = map.entrySet();
        Iterator<Entry<String, String>> aaa = entrySet.iterator();
        while (aaa.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry<String, String>) aaa.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

        }
    }

    @Test
    public void mxTest12时26分() {
        String a = "123456789";
        String[] tmp = a.split("");
        String aaa = "";
        int len = tmp.length;
        for (int i = 0; i < len / 2; i++) {
            aaa = tmp[i];
            tmp[i] = tmp[len - 1 - i];
            tmp[len - 1 - i] = aaa;
        }
        String b = String.valueOf(tmp);
        System.out.println(b);
    }

}
