package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;

import java.util.*;

public class Problem_199 {
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
    // Do a depth-first-search using pre-order traversal
    // When the level is equal to the list size, add the root value to the list
    // Remember to traverse on the right subtree first
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
    // Good solution -> just check for the last element while traversing level-by-level
    static class Solver2 {
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            if(root == null)
                return list;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()) {
                int size = queue.size();
                for(int i = 0; i < size; i++) {
                    TreeNode curr = queue.poll();
                    if(i == size - 1) {
                        list.add(curr.val);
                    }
                    if(curr.left != null) {
                        queue.add(curr.left);
                    }
                    if(curr.right != null) {
                        queue.add(curr.right);
                    }
                }
            }
            return list;
        }
    }
}
