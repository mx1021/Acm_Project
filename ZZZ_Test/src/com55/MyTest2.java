package com55;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.junit.Test;

public class MyTest2
{
    @Test
    public void mxTest21时24分() {
        final StringBuilder a = new StringBuilder();
        a.append("a");
        a.append("b");
        System.out.println(a);

    }

    @Test
    public void mxTest16时43分() {
        System.out.println(YueSeFu(5, 2, 3));
    }

    String YueSeFu(int totalNum, int count, int startNo) {
        if (totalNum <= 1) {
            return "1";
        }
        List<String> lst = new ArrayList<>();
        //赋值
        for (int i = startNo - 1; i < totalNum; i++) {
            lst.add(i + "");
        }
        for (int i = 0; i < startNo - 1; i++) {
            lst.add(i + "");
        }
        int countTmp = 0;
        int now = 0;
        boolean quit = false;
        while (!quit) {
            if (!lst.get(now).equals("-1")) {
                countTmp++;
                if (countTmp == count) {
                    lst.set(now, -1 + "");
                    countTmp = 0;
                }
            }
            now++;
            if (now == totalNum) {
                now = 0;
            }
            quit = lst.stream().filter(x -> !x.equals("-1")).count() == 1;
        }

        int ret = Integer.valueOf(lst.stream().filter(x -> !x.equals("-1")).collect(Collectors.toList()).get(0));
        return ret + 1 + "";
    }

    @Test
    public void mxTest22时15分() {
        int i = 1;
        int a = ++i + ++i + --i;
        System.out.println(a + "||" + i);

    }

    @Test
    public void mxTest10时17分() {
        String reg = "";
        Map<Object, Object> map = new TreeMap<>();
        Object put = map.put("1", "1");
        Object put2 = map.put("1", "2");
        Object put3 = map.put("1", "3");
        Object put4 = map.put("2", "2");
        System.out.println(put);
        System.out.println(put2);
        System.out.println(put3);
        System.out.println(put4);
        System.out.println(map.get("1").toString());
    }

    @Test
    public void mxTest15时01分() {
        int in = 0;
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        while ((in = scan.nextInt()) != 0) {
            int ret = 0;
            int right = (int) Math.sqrt(in);
            int i = 0;
            for (i = right; i > 1; i--) {
                if ((ret = isUseful(i, in)) > 0) {
                    break;
                }
            }
            if (ret > 0) {
                System.out.println(in + ":" + i + "^" + ret);
            }
            else {
                System.out.println(in + ":不符合");
            }
        }
    }

    //N能否是X的K次幂(k>1)
    int isUseful(int X, int N) {
        int tmp = X;
        int K = 1;
        while (tmp < N) {
            tmp = (int) Math.pow(X, ++K);
        }
        if (tmp == N) {
            return K;
        }
        return 0;
    }

    @Test
    public void mxTest15时28分() {
        System.out.println(isOu(0));
        System.out.println(isOu(-3));
        System.out.println(isOu(4));
        System.out.println(isOu(100));
        System.out.println();
        int a = -1 % 2;
        System.out.println(a);
    }

    boolean isOu(int n) {
        return (n & 1) == 0;
    }

    @Test
    public void mxTest16时49分() {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int in = 0;
        while ((in = scan.nextInt()) != 0) {
            if ((in & 1) != 0 || in <= 4) {
                System.out.println("请输入大于4的偶数");
                continue;
            }
            int middle = in / 2;
            boolean flag = false;
            int i = 0;
            for (i = middle - 1; i > 0; i--) {
                if (isSuShu(i) && isSuShu(in - i)) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println(in + ":" + i + "," + (in - i));
            }
        }
    }

    @Test
    public void mxTest17时04分() {
        System.out.println(isSuShu(24));
    }

    boolean isSuShu(int n) {
        int top = (int) Math.sqrt(n);
        for (int i = 2; i <= top; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void mxTest17时36分() {
        long begin = System.currentTimeMillis();
        String bigStr = "125";
        int num = 3;
        LinkedList<Integer> lst1 = getIntList(bigStr);
        LinkedList<Integer> lst2 = new LinkedList<>();

        int tmp = 0;
        int off = 0;
        int val = 0;
        for (int i = lst1.size() - 1; i >= 0; i--) {
            tmp = lst1.get(i) * num + off;
            off = tmp > 10 ? tmp / 10 : 0;
            val = tmp > 10 ? tmp % 10 : tmp;
            lst2.add(val);
        }
        if (off != 0) {
            lst2.add(off);
        }
        Collections.reverse(lst2);
        StringBuilder ret = new StringBuilder();
        for (Integer integer : lst2) {
            ret.append(integer);
        }
        System.out.println(ret);

        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }

    LinkedList<Integer> getIntList(String in) {
        LinkedList<Integer> lst = new LinkedList<>();
        String[] a = in.split("");
        //判断输入为数字 char <48 && char >57 
        /*
         * if (Arrays.asList(a).stream().anyMatch(x ->
         * !Character.isDigit(x.toCharArray()[0]))) {
         * return null;
         * }
         */
        for (String string : a) {
            lst.add(Integer.valueOf(string));
        }
        return lst;
    }

    @Test
    public void mxTest10时46分() {
        for (int i = 100; i < 1000; i++) {
            if (isFlower(i)) {
                System.out.println(i);
            }
        }
    }

    boolean isFlower(int n) {
        int[] a = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.valueOf((n + "").split("")[i]);
        }
        if (n == (Math.pow(a[0], 3) + Math.pow(a[1], 3) + Math.pow(a[2], 3))) {
            return true;
        }
        return false;
    }

    @Test
    public void mxTest10时59分() {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int in = 0;
        int tmp = 0;
        int times = 0;
        StringBuilder sb = new StringBuilder();
        while ((in = scan.nextInt()) != 0) {
            tmp = in;
            times = 0;
            sb.delete(0, sb.length());
            sb.append(tmp + "=");
            while (tmp != 0) {
                sb.append("2^" + which2(low(tmp)) + "+");
                tmp -= low(tmp);
                times++;
            }
            System.out.println(sb.substring(0, sb.length() - 1) + "   " + times);
        }
    }

    //最小的2的幂
    int low(int num) {
        for (int i = num; i > 0; i--) {
            if ((i & i - 1) == 0) {
                //System.out.println(i);
                return i;
            }
        }
        return 0;
    }

    int which2(int num) {
        for (int i = 0;; i++) {
            if (num == Math.pow(2, i)) {
                return i;
            }
        }
    }

    //----------------------
    @Test
    public void mxTest14时20分() {
        System.out.println(isHuiWen("abc"));
        System.out.println(isHuiWen("aba"));

    }

    boolean isHuiWen(String in) {
        if (in == null || in.length() == 0) {
            return false;
        }
        int len = in.length();
        int middle = len / 2;
        String[] inArr = in.split("");
        for (int i = 0; i < middle; i++) {
            if (!inArr[i].equals(inArr[len - 1 - i])) {
                return false;
            }
        }
        return true;
    }

    //-------------------------m([1,100],n个[1,10]) 能否n拼凑出m 求最少值

    @Test
    public void mxTest15时41分() throws InterruptedException {

        while (true) {
            long begin = System.currentTimeMillis();
            System.out.println(begin);
            System.out.println("-----------------------------");
            //輸入
            /*
             * int num = (int) (Math.random() * 50 + 1);
             * int geShu = (int) (Math.random() * 10 + 1);
             * 
             * int[] arrs = new int[geShu];
             * for (int i = 0; i < geShu; i++) {
             * arrs[i] = (int) (Math.random() * 10 + 1);//[1,10]
             * }
             * arrs = getArrs(arrs);
             */
            int num = 38;

            int[] arrs = {1, 3, 4, 5, 8, 9, 10, 10, 10 };
            int geShu = arrs.length;

            //变量
            int times = arrs.length - 1;
            int need = 0;
            int tmp = num;
            int sum = 0;

            StringBuilder sb = new StringBuilder();
            sb.append(num + "=");
            while (times >= 0) {
                int[] arrTmp = new int[times + 1];
                for (int i = 0; i <= times; i++) {
                    arrTmp[i] = arrs[i];
                }
                need = findSmallest(arrTmp, tmp);
                if (need == 0) {
                    break;
                }
                sum += need;
                tmp -= need;
                times = arrTmp[0] - 1;
                sb.append(need + "+");

                if (sum == num || tmp <= 0) {
                    break;
                }
            }
            System.out.println("m:" + num + ",n:" + geShu);
            System.out.println("随机数组：" + Arrays.toString(arrs));

            if (sum == num) {
                System.out.println(sb.substring(0, sb.length() - 1));
            }
            else {
                System.out.println("没有条件满足");
            }

            long end = System.currentTimeMillis();
            System.out.println(end - begin + "ms");
        }
    }

    int[] getArrs(int[] sours) {
        int[] ret = sours;
        for (int i = 0; i < ret.length - 1; i++) {
            for (int j = 0; j < ret.length - 1 - i; j++) {
                if (ret[j] > ret[j + 1]) {
                    ret[j] = ret[j] ^ ret[j + 1];
                    ret[j + 1] = ret[j] ^ ret[j + 1];
                    ret[j] = ret[j] ^ ret[j + 1];
                }
            }
        }
        return ret;
    }

    int findSmallest(int[] arrs, int num) {
        for (int i = arrs.length - 1; i >= 0; i--) {
            if (num >= arrs[i]) {
                int ret = arrs[i];
                arrs[0] = i;//证明第i之后都不要了
                return ret;
            }

        }
        return 0;
    }

    @Test
    public void mxTest19时40分() {
        int a = 10;
        switch (a) {
            default:
                System.out.println("1");
                break;
            case 10:
                System.out.println("2");
                break;

        }
    }

}
