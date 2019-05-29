package com11;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Test;

public class TestAAA
{

    private List<String> XQCodeExc = Arrays.asList("652930", "652931");// 这些辖区得替换掉mx

    @Test
    public void tt() {
        char a = (char) -28;
        System.out.println(a);
        System.out.println(XQCodeExc.contains("652930"));
    }

    @Test
    public void tt2() {

        String x = "string";
        String y = "string";//指向同一个引用
        String z = new String("string");
        System.out.println(x == y); // true
        System.out.println(x.hashCode() == y.hashCode());
        System.out.println(x == z); // false
        System.out.println(x.equals(y)); // true
        System.out.println(x.equals(z)); // true
    }

    @Test
    public void tt3() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(new Date()));
        System.out.println(dtf.format(LocalDateTime.now()));
        
    }

}
