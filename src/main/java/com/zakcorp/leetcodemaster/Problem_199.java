package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_199 {
    static class TreeNode {
        TreeNode left;
        int val;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }
    static class Solver {
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            if(root == null){
                return list;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            int level = 0;
            Map<Integer, List<Integer>> treeMap = new TreeMap<>();
            while(!queue.isEmpty()){
                int size = queue.size();
                level++;
                while(size --> 0) {
                    TreeNode curr = queue.poll();
                    insertIntoMultiValueMap(treeMap, level, curr.val);
                    if(curr.right != null) {
                        queue.add(curr.right);
                    }
                    if(curr.left != null) {
                        queue.add(curr.left);
                    }
                }
            }
            for(int i = 1; i <= treeMap.size(); i++) {
                list.add(treeMap.get(i).get(0));
            }
            return list;
        }
        public void insertIntoMultiValueMap(Map<Integer, List<Integer>> treeMap, int key, int value) {
            if(!treeMap.containsKey(key)) {
                treeMap.put(key, new ArrayList<>());
            }
            treeMap.get(key).add(value);
        }
    }
    static class Solver1 {
        List<Integer> result = new ArrayList<>();
        public List<Integer> rightSideView(TreeNode root) {
            if(root == null) {
                return result;
            }
            dfs(root, 0);
            return result;
        }
        private void dfs(TreeNode root, int level) {
            if(root == null) {
                return;
            }
            if(level == result.size()) {
                result.add(root.val);
            }
            dfs(root.right, level + 1);
            dfs(root.left, level + 1);
        }
    }
}
