package com.epoint.utils;

import org.junit.Test;

//链表
//Definition for singly-linked list.
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
	val = x;
    }

    //判断链表的个数
    public int getLength(ListNode head) {
	if (head == null) {
	    return 0;
	}
	//通过快指针找出链表中间值
	ListNode fast = head.next;
	int count = 0;
	while (fast != null && fast.next != null) {
	    fast = fast.next.next;
	    count++;
	}

	//如果fast是null，代表链表个数为奇数，那么链表个数为count*2+1
	//否则，链表个数为偶数，链表个数为(count+1)*2
	if (fast == null) {
	    return (count + 1) * 2;
	} else {
	    return (count * 2 + 1);
	}
    }

    //返回链表中间节点的值
    public ListNode getMidListNode(ListNode head) {
	if (head == null) {
	    return null;
	}
	//通过快慢指针实现
	ListNode fast = head.next;
	ListNode slow = head;
	while (fast != null && fast.next != null) {
	    slow = slow.next;
	    fast = fast.next.next;
	}
	return slow;
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

    }
}