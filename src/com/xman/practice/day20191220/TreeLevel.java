package com.xman.practice.day20191220;

import com.xman.practice.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: xman
 * @CreateDate: 2019/12/20 14:34
 * @Description: BFS
 */
public class TreeLevel {


    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     * 二叉树的层次遍历
     *
     */
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            ArrayList<List<Integer>> result = new ArrayList<>();
            if (root == null) return result;
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);

            while (!q.isEmpty()) {
                int levelSize = q.size();
                ArrayList<Integer> levelList = new ArrayList<>();
                for (int i = 0; i < levelSize; i++) {
                    TreeNode curNode = q.poll();
                    levelList.add(curNode.val);
                    if (curNode.left != null) q.add(curNode.left);
                    if (curNode.right != null) q.add(curNode.right);
                }
                result.add(levelList);
            }

            return result;
        }
    }
}
