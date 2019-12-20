package com.xman.practice.day20191218;


import com.xman.practice.common.TreeNode;

/**
 * @Author: xman
 * @CreateDate: 2019/12/18 15:40
 * @Description: 二叉树最近公共祖先
 */
public class BinaryTree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null)
            return right;
        else if (right == null)
            return left;
        else return root;
    }

}
