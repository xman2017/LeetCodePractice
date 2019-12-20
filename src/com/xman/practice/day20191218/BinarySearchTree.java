package com.xman.practice.day20191218;


import com.xman.practice.common.TreeNode;

/**
 * @Author: xman
 * @CreateDate: 2019/12/18 16:10
 * @Description: 二叉搜索树最近祖先
 */
public class BinarySearchTree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val == p.val) return p;
        if (root.val == q.val) return q;
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else
            return root;

    }
}
