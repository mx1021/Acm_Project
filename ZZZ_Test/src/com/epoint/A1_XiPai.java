package com.epoint;

import java.util.Arrays;

import org.junit.Test;

public class A1_XiPai
{
    //52张牌随机洗牌
    @Test
    public void mxTest12时20分() {
        int[] arr = new int[52];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println("洗牌前：");
        System.out.println(Arrays.toString(arr));
        XiPai(arr);
        System.out.println("洗牌后：");
        System.out.println(Arrays.toString(arr));

    }

    private void XiPai(int[] arr) {
        int randNum = 0;
        for (int i = 0; i < arr.length; i++) {
            randNum = (int) (Math.random() * 52);
            arr[i] = arr[i] ^ arr[randNum];
            arr[randNum] = arr[i] ^ arr[randNum];
            arr[i] = arr[i] ^ arr[randNum];
        }
    }
}
