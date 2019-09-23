package com.epoint;

import org.junit.Test;

import com.epoint.utils.TreeNode;

/**
 * 给定一个二叉搜索树（Binary Search Tree），把它转换成为累加树（Greater Tree)，
 * 使得每个节点的值是原来的节点值加上所有大于它的节点值之和。

例如：

输入: 二叉搜索树:
              5
            /   \
           2     13

输出: 转换为累加树:
             18
            /   \
          20     13

 * @author Administrator
 *
 */
public class T538_convertBST {
    public TreeNode convertBST(TreeNode root) {
	search(root, 0);
	return root;
    }

    public int search(TreeNode root, int n) {
	if (root == null)
	    return n;
	int right_val = search(root.right, n);
	root.val += right_val; //右中左的中序遍历，所以相加的操作只用在中间做就行了，其他的就是把参数传递到下一层
	int left_val = search(root.left, root.val);
	return left_val;//这里是把左中右三个节点里最后一个遍历的左子节点的返回值，返回给下一层
    }

    @Test
    public void mxTest17时20分() {

	TreeNode a = new TreeNode(2);
	a.left = new TreeNode(1);
	a.right = new TreeNode(3);/*
	a.left.left = new TreeNode(4, null, null);
	a.left.right = new TreeNode(5, null, null);
	a.right.left = new TreeNode(6, null, null);
	a.right.right = new TreeNode(7, null, null);*/


	//search(a, 0);
	
	search_Left(a, 0);
	System.out.println();
    }
    
    //比他小的都加起来
    public int search_Left(TreeNode root, int n) {
	if (root == null)
	    return n;
	int right_val = search(root.left, n);
	root.val += right_val; //右中左的中序遍历，所以相加的操作只用在中间做就行了，其他的就是把参数传递到下一层
	int left_val = search(root.right, root.val);
	return left_val;//这里是把左中右三个节点里最后一个遍历的左子节点的返回值，返回给下一层
    }

}
