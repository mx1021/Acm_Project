package com.epoint;

import org.junit.Test;

import com.epoint.utils.TreeNode;

public class T617_mergeTrees {

    /**
     * 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
    
    你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点。
    
    示例 1:
    
    输入: 
    Tree 1                     Tree 2                  
          1                         2                             
         / \                       / \                            
        3   2                     1   3                        
       /                           \   \                      
      5                             4   7                  
    输出: 
    合并后的树:
         3
        / \
       4   5
      / \   \ 
     5   4   7
    
    来源：力扣（LeetCode）
    链接：https://leetcode-cn.com/problems/merge-two-binary-trees
    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */

    
    public void show1(TreeNode a) {
	if (a == null)
	    return;
	System.out.println(a.val);
	show1(a.left);
	show1(a.right);
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
	if (t1 == null)
	    return t2;
	if (t2 == null)
	    return t1;
	t1.val += t2.val;
	t1.left = mergeTrees(t1.left, t2.left);
	t1.right = mergeTrees(t1.right, t2.right);
	return t1;
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

	TreeNode b = a;
	mergeTrees(a, b);

    }

}
