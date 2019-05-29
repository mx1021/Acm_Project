package com.epoint;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

/*
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * 
 * 示例:
 * 
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * 
 */
public class T1_TwoNumber
{
    @Test
    public void mxTest22时25分() {
        Integer[] nums = {2, 7, 7, 9 };
        int target = 9;
        Integer[] ret = twoSum(nums, target);

        System.out.println(Arrays.toString(ret));
    }

    public Integer[] twoSum(Integer[] nums, int target) {

        //key 索引  value存nums的值
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        //找出比target小的值

        for (int i = 0; i < nums.length; i++) {
            if (target >= nums[i])
                map.put(i, nums[i]);
        }
        
        
        
        
        //返回的数组
        Integer[] ret = new Integer[2];
        Iterator<Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        Entry<Integer, Integer> next = null;
        int tmp = 0;
        while (iterator.hasNext()) {
            next = iterator.next();
            tmp = target - next.getValue();
            if (map.containsValue(target - next.getValue())) {
                for (int i = next.getKey() + 1; i < map.size(); i++) {
                    if (map.get(i) == tmp) {
                        ret[0] = next.getKey();
                        ret[1] = i;
                        return ret;
                    }
                }
            }
        }
        return new Integer[2];

    }
}
