package com.epoint;

import org.junit.Test;

import com.epoint.utils.TreeNode;

/**
 * 
 * @author Administrator
 *翻转一棵二叉树。

示例：

输入：

     4
   /   \
  2     7
 / \   / \
1   3 6   9
输出：

     4
   /   \
  7     2
 / \   / \
9   6 3   1
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
*
 */
public class T226_invertTree {
    public TreeNode invertTree(TreeNode root) {
	if (root == null) {
	    return null;
	}
	TreeNode right = invertTree(root.right);
	TreeNode left = invertTree(root.left);
	root.left = right;
	root.right = left;
	return root;
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
	leftTree(a);
	TreeNode b = invertTree(a);
	System.out.println();
	leftTree(b);

    }

    public void leftTree(TreeNode root) {
	if (root == null)
	    return;
	System.out.print(root.val);
	leftTree(root.left);
	leftTree(root.right);
    }

    public void rightTree(TreeNode root) {
	if (root == null)
	    return;
	rightTree(root.left);
	rightTree(root.right);
	System.out.print(root.val);
    }

}
