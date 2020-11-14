package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_108 {
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
    static class Solver1 {
        public TreeNode sortedArrayToBST(int[] arr) {
            return dfs(0, arr.length - 1, arr);
        }
        private TreeNode dfs(int left, int right, int[] arr) {
            if(left > right) {
                return null;
            }
            int mid = (left + right) / 2;
            TreeNode root = new TreeNode(arr[mid]);
            root.left = dfs(left, mid - 1, arr);
            root.right = dfs(mid + 1, right, arr);
            return root;
        }
    }
}
