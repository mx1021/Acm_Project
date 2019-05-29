package com11;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.Test;

public class MyTest2
{

    @Test
    public void test09点49分() {
        Hashtable map = new Hashtable<>();
        map.put("a", "1");
        map.put(null, null);
        //System.out.println(map);

    }

    @Test
    public void test11点04分() {
        String[] a = {"1", "2", "3" };
        List list = Arrays.asList(a);
        String[] b = (String[]) list.toArray();
        System.out.println(b);
    }

    @Test
    public void test11点13分() {
        List list = Arrays.asList("1", "2", "3", "4");
        Iterator i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        for (Object object : list) {
            System.out.println(object);
        }

        System.out.println(list.get(list.size() - 1));
        List list2 = Arrays.asList("2", "1", "5", "-1");
        Collections.sort(list2);
        System.out.println(list2);
        System.out.println(Collections.binarySearch(list2, "2"));
    }

    @Test
    public void test11点51分() {
        Stack a = new Stack<>();
        a.push("1");
        a.push("2");
        System.out.println(a.peek());
        System.out.println(a.pop());
    }

    @Test
    public void test11点55分() {
        TreeSet ts = new TreeSet();
        ts.add(1 + "");
        ts.add(3 + "");
        ts.add(2 + "");
        ts.add(0 + "");

        Iterator it = ts.iterator();
        while (it.hasNext()) {
            String fruit = (String) it.next();
            System.out.println(fruit);
        }
    }

    @Test
    public void test14点26分() {
        Queue qu = new LinkedList<>();
        qu.add("1");
        qu.add("2");
        qu.add("3");
        System.out.println(qu.poll());
        System.out.println(qu.poll());
        System.out.println(qu.peek());
        System.out.println(qu.poll());
        System.out.println(qu.remove());
        System.out.println(qu);

        Iterator i = qu.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

    @Test
    public void test14点32分() {
        Map map = new ConcurrentHashMap<String, String>();
        map.put("1", "2");
        System.out.println(map);
    }

    @Test
    public void test14点34分() {
        Map map = new TreeMap<>();
        map.put("1", "1");
        map.put("-1", "-1");
        map.put("0", "0");
        map.put("100", "100");
        Set keySet = map.keySet();
        Iterator i = keySet.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

    @Test
    public void mxTest11时30分() {
        Set<People> set = new HashSet<>();
        set.add(new People("1", "1"));
        set.add(new People("1", "2"));
        set.add(null);
        System.out.println(set.size());
        for (People object : set) {
            System.out.println(object.name + "||" + object.age);
        }
        
    }

}
