package com.epoint;

import org.junit.Test;

/**
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。

给出两个整数 x 和 y，计算它们之间的汉明距离。

注意：
0 ≤ x, y < 231.

示例:

输入: x = 1, y = 4

输出: 2

解释:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

上面的箭头指出了对应二进制位不同的位置。

 * @author Administrator
 *
 */

public class T461_hammingDistance {
    public int hammingDistance(int x, int y) {
	String xx = Integer.toBinaryString(x);
	String yy = Integer.toBinaryString(y);
	int len = Math.max(xx.length(), yy.length());
	if (len > xx.length()) {
	    String temp0 = "";
	    int cha = len - xx.length();
	    for (int i = 0; i < cha; i++) {
		temp0 += "0";
	    }
	    xx = temp0 + xx;
	} else {
	    String temp0 = "";
	    int cha = len - yy.length();
	    for (int i = 0; i < cha; i++) {
		temp0 += "0";
	    }
	    yy = temp0 + yy;

	}
	String[] xStr = xx.split("");
	String[] yStr = yy.split("");
	int nums = 0;
	for (int i = 0; i < len; i++) {
	    if (!xStr[i].equals(yStr[i])) {
		nums++;
	    }
	}
	return nums;
    }

    @Test
    public void mxTest17时20分() {
	int x = 10;
	int y = 14;
	System.out.println(Integer.toBinaryString(x));
	System.out.println(Integer.toBinaryString(y));
	System.out.println(hammingDistance(x, y));
    }
}
/**
 * 思路：转成二进制字符串，以0补齐左边长度，再逐个对比
 */
