package com.epoint;

import org.junit.Test;

import com.epoint.utils.ListNode;

/**
 * 
 * @author Administrator
 *反转一个单链表。

示例:

输入: 1->2->3->4->5->NULL
输出: 5->4->3->2->1->NULL
进阶:
你可以迭代或递归地反转链表。你能否用两种方法解决这道题？

 */
public class T206_reverseList {
    public ListNode reverseList(ListNode head) {
	ListNode pre = null;
	ListNode tmp = null;
	while (head != null) {
	    tmp = head.next;
	    head.next = pre;
	    pre = head;
	    head = tmp;
	}
	return pre == null ? head : pre;

    }

    @Test
    public void mxTest10时33分() {
	ListNode head = new ListNode(1);
	head.next = new ListNode(2);
	head.next.next = new ListNode(3);
	head.next.next.next = new ListNode(4);
	head.next.next.next.next = new ListNode(5);
	head.next.next.next.next.next = new ListNode(6);
	head.next.next.next.next.next.next = new ListNode(7);
	head.next.next.next.next.next.next.next = new ListNode(8);
	head.next.next.next.next.next.next.next.next = new ListNode(9);

	ListNode ret = reverseList(head);
	while (ret != null) {
	    System.out.print(ret.val);
	    ret = ret.next;
	}

    }
}
