package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_107 {
    static class TreeNode {
        TreeNode left;
        int val;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    static class Solver {
        public List<List<Integer>> levelOrderBottomUsingLinkedList(TreeNode root) {
            List<List<Integer>> resultList = new LinkedList<>();
            if (root == null) {
                return resultList;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                List<Integer> list = new LinkedList<>();
                while (size-- > 0) {
                    TreeNode curr = queue.poll();
                    if (curr.left != null) {
                        queue.add(curr.left);
                    }
                    if (curr.right != null) {
                        queue.add(curr.right);
                    }
                    list.add(curr.val);
                }
                resultList.add(0, list);
            }
            return resultList;
        }

        public List<List<Integer>> levelOrderBottomUsingArrayList(TreeNode root) {
            List<List<Integer>> resultList = new ArrayList<>();
            if (root == null) {
                return resultList;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            List<List<Integer>> tempList = new ArrayList<>();
            while (!queue.isEmpty()) {
                int size = queue.size();
                List<Integer> list = new ArrayList<>();
                while (size-- > 0) {
                    TreeNode curr = queue.poll();
                    list.add(curr.val);
                    if (curr.left != null) {
                        queue.add(curr.left);
                    }
                    if (curr.right != null) {
                        queue.add(curr.right);
                    }
                }
                tempList.add(list);
            }
            for (int i = tempList.size() - 1; i >= 0; i--) {
                resultList.add(0, tempList.get(i));
            }
            return resultList;
        }

        public List<List<Integer>> levelOrderBottomUsingHashing(TreeNode root) {
            List<List<Integer>> resultList = new ArrayList<>();
            if (root == null) {
                return resultList;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            Map<Integer, List<Integer>> treeMap = new TreeMap<>();
            int level = 0;
            while (!queue.isEmpty()) {
                int size = queue.size();
                level++;
                while (size-- > 0) {
                    TreeNode curr = queue.poll();
                    insertIntoMultiValuedTreeMap(treeMap, level, curr.val);
                    if (curr.left != null) {
                        queue.add(curr.left);
                    }
                    if (curr.right != null) {
                        queue.add(curr.right);
                    }
                }
            }
            for (int i = treeMap.size(); i > 0; i--) {
                resultList.add(treeMap.get(i));
            }
            return resultList;
        }

        public void insertIntoMultiValuedTreeMap(Map<Integer, List<Integer>> treeMap, int key, int value) {
            if (!treeMap.containsKey(key)) {
                treeMap.put(key, new ArrayList<>());
            }
            treeMap.get(key).add(value);
        }
    }
}
