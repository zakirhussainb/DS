package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1469 {
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
        public List<Integer> solve1(TreeNode root) {
            Map<TreeNode, List<Integer>> map = new HashMap<>();
            preOrder(root, map);
            List<Integer> result = new ArrayList<>();
            for(Map.Entry<TreeNode, List<Integer>> entry : map.entrySet()) {
                if(entry.getValue().size() == 1) {
                    result.add(entry.getValue().get(0));
                }
            }
            return result;
        }
        private void preOrder(TreeNode root, Map<TreeNode, List<Integer>> map) {
            if(root == null) {
                return;
            }
            if( !map.containsKey(root) ) {
                map.put(root, new ArrayList<>());
            }
            if(root.left != null) {
                map.get(root).add(root.left.val);
            }
            if(root.right != null) {
                map.get(root).add(root.right.val);
            }
            preOrder(root.left, map);
            preOrder(root.right, map);
        }
    }
    static class Solver2 {
        public List<Integer> solve1(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            preOrder(root, result);
            return result;
        }
        private void preOrder(TreeNode root, List<Integer> list) {
            if(root == null) {
                return;
            }
            if(root.left == null && root.right != null) {
                list.add(root.right.val);
            }
            if(root.left != null && root.right == null) {
                list.add(root.left.val);
            }
            preOrder(root.left, list);
            preOrder(root.right, list);
        }
    }
}
