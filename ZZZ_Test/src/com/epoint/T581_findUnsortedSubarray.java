package com.epoint;

import java.util.Arrays;

import org.junit.Test;

/**
 * 给定一个整数数组，你需要寻找一个连续的子数组，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。

你找到的子数组应是最短的，请输出它的长度。

示例 1:

输入: [2, 6, 4, 8, 10, 9, 15]
输出: 5
解释: 你只需要对 [6, 4, 8, 10, 9] 进行升序排序，那么整个表都会变为升序排序。
说明 :

输入的数组长度范围在 [1, 10,000]。
输入的数组可能包含重复元素 ，所以升序的意思是<=。

 * @author Administrator
 *
 */

public class T581_findUnsortedSubarray {

    public int findUnsortedSubarray(int[] nums) {
	int[] snums = nums.clone();
	Arrays.sort(snums);
	int start = snums.length, end = 0;
	for (int i = 0; i < snums.length; i++) {
	    if (snums[i] != nums[i]) {
		start = Math.min(start, i);
		end = Math.max(end, i);
	    }
	}
	return (end - start >= 0 ? end - start + 1 : 0);
    }

    public int findUnsortedSubarray2(int[] nums) {
	int[] snums = nums.clone();
	Arrays.sort(snums);
	int start = 0, end = 0;
	for (int i = 0; i < snums.length; i++) {
	    if (snums[i] != nums[i]) {
		start = i;
		for (int j = snums.length - 1; j > start; j--) {
		    if (snums[j] != nums[j]) {
			end = j;
			return (end - start > 0 ? end - start + 1 : 0);
		    }
		}

	    }
	}
	return 0;
    }

    @Test
    public void mxTest17时20分() {
	int[] a = { 1, 2, 4, 3, 3 };
	System.out.println(findUnsortedSubarray(a));
	System.out.println(findUnsortedSubarray2(a));
    }
}
/**
 * 我们将数组 numsnums 进行排序，记为 nums\_sortednums_sorted 。
 * 然后我们比较 numsnums 和 nums\_sortednums_sorted 的元素来决定最左边和最右边不匹配的元素。
 * 它们之间的子数组就是要求的最短无序子数组
 * 
 * 
 * 方法2是自己优化的

 */
