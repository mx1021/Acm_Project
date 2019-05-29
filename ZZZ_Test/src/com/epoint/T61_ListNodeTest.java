package com.epoint;

import org.junit.Test;

public class T61_ListNodeTest
{

    class ListNode
    {
        int val;
        ListNode next;

        ListNode(int v, ListNode next) {
            this.val = v;
            this.next = next;
        }
    }
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

    @Test
    public void mxTest21时50分() {
        ListNode node1 = new ListNode(1, null);
        ListNode node2 = new ListNode(2, node1);
        ListNode node3 = new ListNode(3, node2);
        ListNode node4 = new ListNode(4, node3);
        ListNode node5 = new ListNode(5, node4);
        ListNode head = node5;

        head = rotateRight(head, 2);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
