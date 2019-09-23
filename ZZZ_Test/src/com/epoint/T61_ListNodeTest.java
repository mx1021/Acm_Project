package com.epoint;

import com.epoint.utils.ListNode;

public class T61_ListNodeTest {

    //往右循环右移k位置

    public ListNode rotateRight(ListNode head, int k) {
	if (head == null) {
	    return null;
	}
	if (head.next == null) {
	    return head;
	}
	int len = 0;
	ListNode tmp = head;
	while (tmp != null) {
	    len++;
	    tmp = tmp.next;
	}

	k = (k >= len) ? (k % len) : k;

	ListNode last1 = head;//倒数第二个
	ListNode last0 = head;//倒数第一个
	tmp = head;
	for (int i = 0; i < k; i++) {
	    //得到倒数两个
	    while (tmp.next != null) {
		last1 = tmp;
		last0 = tmp.next;
		tmp = tmp.next;

	    }
	    last1.next = null;
	    last0.next = head;
	    head = last0;
	}
	return head;
    }

}
