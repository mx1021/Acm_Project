package com.epoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/**
 * 找到字符串中所有字母异位词
 * @author Administrator
 * 给定一个字符串 s 和一个非空字符串 p，找到 s 中所有是 p 的字母异位词的子串，返回这些子串的起始索引。

字符串只包含小写英文字母，并且字符串 s 和 p 的长度都不超过 20100。

说明：

字母异位词指字母相同，但排列不同的字符串。
不考虑答案输出的顺序。
示例 1:

输入:
s: "cbaebabacd" p: "abc"

输出:
[0, 6]

解释:
起始索引等于 0 的子串是 "cba", 它是 "abc" 的字母异位词。
起始索引等于 6 的子串是 "bac", 它是 "abc" 的字母异位词。
 示例 2:

输入:
s: "abab" p: "ab"

输出:
[0, 1, 2]

解释:
起始索引等于 0 的子串是 "ab", 它是 "ab" 的字母异位词。
起始索引等于 1 的子串是 "ba", 它是 "ab" 的字母异位词。
起始索引等于 2 的子串是 "ab", 它是 "ab" 的字母异位词。
**************
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
*
 *
 */
public class T438_findAnagrams {

    //自己的做法，好理解,但是超时了
    public List<Integer> findAnagramsMine(String s, String p) {
	if (s == null || p == null || s.length() == 0 || p.length() == 0) {
	    return new ArrayList<>();
	}
	List<Integer> retList = new ArrayList<>();
	int lenP = p.length();
	String[] sStrs = s.split("");

	String tmpS = "";
	//逐个比较
	for (int i = 0; i < sStrs.length - lenP + 1; i++) {
	    tmpS = s.substring(i, i + lenP);
	    if (isvalid(tmpS, p)) {
		retList.add(i);
	    }

	}
	return retList;

    }

    //判断是否字母异位
    public boolean isvalid(String temp, String p) {
	if (temp.length() != p.length()) {
	    return false;
	}
	int[] array = new int[26];
	for (char a : temp.toCharArray()) {
	    array[a - 'a']++;
	}
	for (char b : p.toCharArray()) {
	    array[b - 'a']--;
	}
	for (int num : array) {
	    if (num != 0) {
		return false;
	    }
	}
	return true;
    }

    @Test
    public void mxTest17时18分() {
	List<Integer> findAnagrams = findAnagramsMine("cbaebabacd", "abc");
	System.out.println(findAnagrams);
    }

    //---------------------------------------------------------------------
    // 双指针 -> 滑动窗口
    public List<Integer> findAnagrams(String s, String p) {

	List<Integer> list = new ArrayList<>();
	if (s == null || p == null || s.length() < p.length())
	    return list;

	int[] a2z = new int[26];
	int[] curA2z = new int[26];

	for (int i = 0; i < p.length(); ++i) {
	    a2z[p.charAt(i) - 'a']++; // 记录p串有哪些字符
	    curA2z[s.charAt(i) - 'a']++;
	}

	int i = 0;
	int j = p.length();

	// 窗口大小固定为p的长度
	while (j < s.length()) {
	    if (isSame(a2z, curA2z))
		list.add(i);
	    curA2z[s.charAt(i++) - 'a']--;
	    curA2z[s.charAt(j++) - 'a']++; // 没找到符合条件的窗口，移动右指针
	}

	if (isSame(a2z, curA2z)) // 检查最末尾的 p.length() 个字符是否符合条件
	    list.add(i);

	return list;
    }

    public boolean isSame(int[] arr1, int[] arr2) {
	for (int i = 0; i < arr1.length; ++i)
	    if (arr1[i] != arr2[i])
		return false;
	return true;
    }

}
