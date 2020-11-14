package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_257 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
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
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> list = new ArrayList<>();
            dfs(root, "", list);
            return list;
        }
        private void dfs(TreeNode root, String path, List<String> list) {
            if(root == null) {
                return;
            }
            path += String.valueOf(root.val);
            if(root.left == null && root.right == null) {
                list.add(path);
            } else {
                path += "->";
                dfs(root.left, path, list);
                dfs(root.right, path, list);
            }
        }
    }
}
