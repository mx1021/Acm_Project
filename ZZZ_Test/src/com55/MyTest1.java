package com55;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Pattern;

import org.junit.Test;

public class MyTest1
{

    @Test
    public void mxTest14时11分() {
        Integer a10 = 10;
        System.out.println(Integer.toBinaryString(10));//2进制
        System.out.println(Integer.toHexString(10));//16进制
        System.out.println(Integer.toOctalString(10));//8进制

        int tmp = 12;
        int sum = 0;
        int num = 0;
        while (tmp != 0) {
            sum += (tmp % 8) * (int) (Math.pow(10, num++));
            tmp = tmp/8;

        }
        System.out.println(sum);

    }

    @Test
    public void Ten2Eight() {
        int a10 = 144;
        int tmp = a10;
        int sum = 0;
        int num = 0;
        while (tmp != 0) {
            sum += (tmp % 8) * (int) (Math.pow(10, num++));
            a10 = tmp / 8;
            tmp = a10;
        }
        System.out.println(sum);
    }

    @Test
    public void mxTest14时56分() {
        int a8 = 144;
        int sum = 0;
        int num = 0;
        String[] arr = String.valueOf(a8).split("");
        for (int i = arr.length - 1; i >= 0; i--) {
            sum += Integer.valueOf(arr[i]) * Math.pow(8, num++);
        }
        System.out.println(sum);
    }

    @Test
    public void mxTest15时19分() {
        String in = "asdsfjkllk";
        char[] inArr = in.toCharArray();
        int len = inArr.length;
        Map<String, String> map = new TreeMap<>();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (inArr[i] == inArr[j]) {
                    String tmp = in.substring(i, j + 1);
                    if (isHuiWen(tmp)) {
                        map.put(tmp.length() + "", tmp);
                    }
                }
            }
        }
        Set<String> keySet = map.keySet();
        for (String string : keySet) {
            System.out.println(map.get(string));
        }
    }

    //判断是否回文
    boolean isHuiWen(String in) {
        if (in == null || in.length() < 2) {
            return false;
        }

        boolean ret = true;
        char[] inArr = in.toCharArray();
        int len = inArr.length;
        for (int i = 0; i < len / 2; i++) {
            if (inArr[i] != inArr[len - 1 - i]) {
                ret = false;
            }
        }
        return ret;
    }

    @Test
    public void mxTest15时47分() {
        int a = 2;
        System.out.println((a & (a - 1)) == 0);
    }

    @Test
    public void mxTest16时32分() {
        List<String> aa = new ArrayList<>();
        for (String string : aa) {

        }

        byte a = (byte) 129;
        System.out.println(a);

        int bb = 1;
        bb = bb << 100;
        System.out.println(bb);

    }

    //flower
    @Test
    public void mxTest14时20分() {
        for (int i = 100; i < 1000; i++) {
            if (isFlower(i)) {
                System.out.print(i + ",");
            }
        }

    }

    boolean isFlower(int in) {
        if (in < 100 || in > 999) {
            return false;
        }
        boolean ret = false;
        int a = in / 100;
        int b = in / 10 % 10;
        int c = in % 10;
        int sum = a * a * a + b * b * b + c * c * c;
        if (sum == in) {
            ret = true;
        }
        return ret;
    }

    int bbb = 0;

    @Test
    public void mxTest14时48分() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(cow(i) + ",");
        }
    }

    int cow(int n) {
        if (n < 4) {
            bbb = 0;
            return 1;
        }
        else if (n == 4) {
            bbb = 0;
            return 2;
        }
        else if (n == 5) {
            bbb = 1;
            return 3;
        }
        return cow(n - 1) + bbb++;
    }

    @Test
    public void mxTest15时49分() {
        char[] a = {'a', 'b', '奥' };
        String b = "" + a[0] + a[1] + a[2];
        String c = String.valueOf(a);
        System.out.println(b + "|" + c);
    }

    @Test
    public void mxTest18时50分() {
        boolean ret = Pattern.matches("^a", "abc");
        System.out.println(ret);
    }

    @Test
    public void mxTest19时45分() throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream("aa.properties"), "UTF-8"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("bb.properties"));
        String str = "";
        while ((str = reader.readLine()) != null) {
            writer.write(str);
            System.out.println(str);
            writer.newLine();
        }
        reader.close();
        writer.close();
    }

}
