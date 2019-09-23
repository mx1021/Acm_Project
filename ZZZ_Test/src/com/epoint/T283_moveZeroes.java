package com.epoint;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 *  移动零
 * @author Administrator
 *给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

示例:

输入: [0,1,0,3,12]
输出: [1,3,12,0,0]
说明:

必须在原数组上操作，不能拷贝额外的数组。
尽量减少操作次数。
*
*
*
*
*
*
*
*
*
*
 */
public class T283_moveZeroes {
    //这是自己的写法
    public void moveZeroesMine(int[] nums) {
	List<Integer> list = new ArrayList<>();
	for (Integer integer : nums) {
	    if (integer != 0)
		list.add(integer);
	}
	for (int i = 0; i < list.size(); i++) {
	    nums[i] = list.get(i);
	}
	for (int i = list.size(); i < nums.length; i++) {
	    nums[i] = 0;
	}
	for (Integer integer : nums) {
	    System.out.print(integer + ",");
	}
	System.out.println();
    }

    //参考别人的优秀代码
    public void moveZeroes(int[] nums) {
	int count0 = 0;//记录0的个数
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] != 0) {
		nums[count0++] = nums[i];
	    }
	}
	for (int i = count0; i < nums.length; i++) {
	    nums[i] = 0;
	}
	for (Integer integer : nums) {
	    System.out.print(integer + ",");
	}
	System.out.println();

    }

    @Test
    public void mxTest10时08分() {
	int[] a = { 2, 4, 0, 1, 0, 5 };
	moveZeroes(a);
    }
}
