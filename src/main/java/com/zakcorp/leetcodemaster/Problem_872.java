package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_872 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {
        }
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    static class Solver {
        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();
            dfs(root1, list1);
            dfs(root2, list2);
            if(list1.size() != list2.size()) {
                return false;
            }
            for(int i = 0; i < list1.size(); i++) {
                if(!list1.get(i).equals(list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
        private void dfs(TreeNode root, List<Integer> list) {
            if(root == null)
                return;
            if(root.left == null && root.right == null) {
                list.add(root.val);
            }
            dfs(root.left, list);
            dfs(root.right, list);
        }
    }
}
