package com.epoint.utils;

import org.junit.Test;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
	val = x;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
	this.val = val;
	this.left = left;
	this.right = right;
    }

    @Test
    public void mxTest17时20分() {
	TreeNode a = new TreeNode(1);
	a.left = new TreeNode(2);
	a.right = new TreeNode(3);
	a.left.left = new TreeNode(4, null, null);
	a.left.right = new TreeNode(5, null, null);
	a.right.left = new TreeNode(6, null, null);
	a.right.right = new TreeNode(7, null, null);

    }

}
