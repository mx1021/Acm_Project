package com.epoint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.epoint.utils.ListNode;

/**
 * 回文链表
 * @author Administrator
 *请判断一个链表是否为回文链表。

示例 1:

输入: 1->2
输出: false
示例 2:

输入: 1->2->2->1
输出: true
进阶：
你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
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
public class T234_isPalindrome {

    //自己的思路是，取出全部元素放进list，再反转后比较。
    //速度不够快，建议先反转前半部分的链表，在和后半部分比较即可
    public boolean isPalindromeMine(ListNode head) {
	List<Integer> list = new ArrayList<>();
	List<Integer> list2 = new ArrayList<>();

	while (head != null) {
	    list.add(head.val);
	    list2.add(head.val);
	    head = head.next;
	}
	Collections.reverse(list);
	return list2.equals(list);
    }

    //先反转前半部分，在直接和后面的比较即可
    //找链表中点，是通过快慢指针来找的
    public boolean isPalindrome(ListNode head) {
	if (head == null || head.next == null) {
	    return true;
	}
	ListNode pre = null;
	ListNode tmp = null;

	ListNode fast = head.next;
	ListNode slow = head;
	//如果fast是null，代表链表个数为奇数，那么链表个数为count*2+1
	//否则，链表个数为偶数，链表个数为(count+1)*2
	while (fast != null && fast.next != null) {
	    tmp = slow.next;
	    slow.next = pre;
	    pre = slow;
	    slow = tmp;

	    fast = fast.next.next;
	}
	ListNode halfA = null;//前一半
	ListNode halfB = null;//后一半
	if (fast == null) {//奇数
	    halfA = pre;
	    halfB = slow.next;
	} else {//偶数
	    tmp = slow.next;
	    halfA = slow;
	    halfA.next = pre;
	    halfB = tmp;
	}
	while (halfA != null) {
	    if (halfA.val != halfB.val) {
		return false;
	    }
	    halfA = halfA.next;
	    halfB = halfB.next;
	}

	return true;
    }

    @Test
    public void mxTest10时33分() {
	ListNode head = new ListNode(1);
	head.next = new ListNode(2);
	head.next.next = new ListNode(3);
	head.next.next.next = new ListNode(4);
	head.next.next.next.next = new ListNode(1);
	head.next.next.next.next.next = new ListNode(4);
	head.next.next.next.next.next.next = new ListNode(3);
	head.next.next.next.next.next.next.next = new ListNode(2);
	head.next.next.next.next.next.next.next.next = new ListNode(1);

	System.out.println(isPalindrome(head));
    }
}
