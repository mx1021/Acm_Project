package com11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Hashtable;

import org.junit.Test;

public class MyTest3
{
    @Test
    public void test09点49分() {
        Hashtable<String, String> table =  new Hashtable<>();
        table.put("1", "2");
        System.out.println(table.containsKey("1"));}

    class mythread extends Thread
    {
        @Override
        public void run() {
            // TODO Auto-generated method stub
            super.run();
        }
    }

    class myrunnable implements Runnable
    {

        @Override
        public void run() {
            // TODO Auto-generated method stub

        }
    }

    @Test
    public void test17点48分() throws IOException {
        File file = new File("abc.txt");
        // 如果文件不存在则创建文件
        if (!file.exists()) {
            file.createNewFile();
        }
        InputStream inputStream = new FileInputStream(file);
        // 这里定义了数组的长度是1024个字节，如果文件超出这字节，就会溢出，结果就是读不到1024字节以后的东西
        byte[] bs = new byte[1024];
        // 这里len获得的是文件中内容的长度
        int len = inputStream.read(bs);
        //int lens = inputStream.read();
        inputStream.close();
        System.out.println(new String(bs));
        System.out.println(file.length());
    }

    @Test
    public void test19点45分() throws IOException {
        File file = new File("xyz.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        OutputStream out = new FileOutputStream(file);
        String a = "你好撒娇的哈斯 哈说不定哈aaaa";
        byte[] bytea = a.getBytes();
        out.write(bytea);
    }

    @Test
    public void test20点28分() throws IOException {
        File file = new File("abc.txt");
        if (!file.exists()) {
            return;
        }

        File tofile = new File("ABCD.txt");
        if (!tofile.exists()) {
            tofile.createNewFile();
        }
        InputStream in = new FileInputStream(file);
        byte[] a = new byte[(int) file.length()];
        in.read(a);
        System.out.println(new String(a));
        OutputStream out = new FileOutputStream(tofile, true);
        out.write(a);
    }

    @Test
    public void test10点39分() {

        System.out.println(Math.round(-4.5));
    }

}
