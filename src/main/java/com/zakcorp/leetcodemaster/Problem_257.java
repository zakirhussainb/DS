package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;

import java.util.*;

public class Problem_257 {
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

    // Iterative version
    static class Solver1 {
        public List<String> solve1(TreeNode root) {
            List<String> expected = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            Map<TreeNode, List<Integer>> parentMap = new HashMap<>();
            parentMap.put(root, new ArrayList<>());
            parentMap.get(root).add(root.val);
            while(!stack.isEmpty()) {
                TreeNode curr = stack.pop();
                if(curr.left == null && curr.right == null) {
                    StringBuilder sb = new StringBuilder();
                    for(int num : parentMap.get(curr)) {
                        sb.append(num);
                        sb.append("->");
                    }
                    sb.delete(sb.length() - 2, sb.length());
                    expected.add(sb.toString());
                }
                if(curr.right != null) {
                    stack.push(curr.right);
                    if(!parentMap.containsKey(curr.right))
                        parentMap.put(curr.right, new ArrayList<>());
                    parentMap.get(curr.right).add(0, curr.right.val);
                    parentMap.get(curr.right).addAll(0, parentMap.get(curr));
                }
                if(curr.left != null) {
                    stack.push(curr.left);
                    if(!parentMap.containsKey(curr.left))
                        parentMap.put(curr.left, new ArrayList<>());
                    parentMap.get(curr.left).add(0, curr.left.val);
                    parentMap.get(curr.left).addAll(0, parentMap.get(curr));
                }
            }
            return expected;
        }
    }
}
