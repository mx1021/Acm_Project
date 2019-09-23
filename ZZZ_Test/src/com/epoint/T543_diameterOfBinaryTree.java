package com.epoint;

import org.junit.Test;

/**
 * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过根结点。

示例 :
给定二叉树

          1
         / \
        2   3
       / \     
      4   5    
返回 3, 它的长度是路径 [4,2,1,3] 或者 [5,2,1,3]。

注意：两结点之间的路径长度是以它们之间边的数目表示。

 * @author Administrator
 *
 */
public class T543_diameterOfBinaryTree {
    public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
	    val = x;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
	    this.val = val;
	    this.left = left;
	    this.right = right;
	}

    }

    public int len = 0;

    public int diameterOfBinaryTree(TreeNode root) {
	dep(root);
	return len;
    }

    public int dep(TreeNode node) {
	if (node == null) {
	    return 0;
	}
	int leftDep = dep(node.left);
	int rightDep = dep(node.right);
	len = Math.max(leftDep + rightDep, len);
	return Math.max(leftDep, rightDep) + 1;
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

	System.out.println(diameterOfBinaryTree(a));
    }
}
/**
 * 求左右高度之和即可
*/