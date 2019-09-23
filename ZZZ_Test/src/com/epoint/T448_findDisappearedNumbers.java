package com.epoint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/**
 * 找到所有数组中消失的数字
 * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。

找到所有在 [1, n] 范围之间没有出现在数组中的数字。

您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。

示例:

输入:
[4,3,2,7,8,2,3,1]

输出:
[5,6]
 * @author Administrator
 *
 */
public class T448_findDisappearedNumbers {
    //我的写法，超时了，很low
    public List<Integer> findDisappearedNumbers(int[] nums) {
	List<Integer> lst = new ArrayList<>();
	for (int i : nums) {
	    if (!lst.contains(i))
		lst.add(i);
	}
	int temp = lst.size();
	Collections.sort(lst);
	for (int i = 1; i <= nums.length; i++) {
	    if (!lst.subList(0, temp).contains(i)) {
		lst.add(i);
	    }
	}

	return lst.subList(temp, lst.size());
    }

    //别人的写法，很聪明
    public List<Integer> findDisappearedNumbers2(int[] nums) {
	ArrayList<Integer> list = new ArrayList<Integer>();//store array elements
	int index;//set index where the elements should be stored 
	for (int i = 0; i < nums.length; i++) {
	    //只要这个数字存在，那么我就给这个数字对应位做个标记
	    index = nums[i] % nums.length;
	    if (index == 0) {
		nums[nums.length - 1] += nums.length;
	    } else {
		nums[index - 1] += nums.length;
	    }
	}
	for (int j = 0; j < nums.length; j++) {
	    //得是<=  不然会少算的
	    if (nums[j] <= nums.length)
		list.add(j + 1);//index+1 for what we get is index,ans is num
	}
	return list;
    }

    @Test
    public void mxTest17时20分() {
	int[] a = { 4, 3, 2, 7, 8, 2, 3, 1 };
	List<Integer> findDisappearedNumbers = findDisappearedNumbers2(a);
	for (Integer integer : findDisappearedNumbers) {
	    System.out.println(integer);
	}
    }

    @Test
    public void mxTest16时17分() {
	System.out.println(8 % 8);
    }
}
