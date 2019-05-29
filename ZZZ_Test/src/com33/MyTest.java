package com33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.junit.Test;

public class MyTest
{
    @Test
    public void test16点21分() throws FileNotFoundException, IOException {

        Properties pro = new Properties();
        pro.load(new InputStreamReader(new FileInputStream("aa.properties"), "UTF-8"));
        Iterator<String> aa = pro.stringPropertyNames().iterator();
        while (aa.hasNext()) {
            String name = aa.next();
            System.out.println(name + ":" + pro.getProperty(name));

        }

    }

    @Test
    public void test09点53分() {
        Double a = 0.0003;
        System.out.println(new BigDecimal(a).multiply(new BigDecimal(10000)).doubleValue());

        final String b = "aaa";
        System.out.println(b.toUpperCase());
    }

    @Test
    public void test17点00分() {
        boolean inEpoint = true;
        while (inEpoint) {
            job();
        }
    }

    void job() {
        System.out.println("boring...");
    }

    @Test
    public void test13点43分() {
        List<String> list = Arrays.asList("1","2","3");
        String join = String.join(";", list);
        System.out.println(join);
    }

}
