package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;

import java.util.*;

public class Problem_1457 {
    // This solution gives TLE as it is very slow.
    static class Solver {
        public int solve1(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            if(root == null)
                return 0;
            preorder(root, res, new LinkedList<>());
            int ans = 0;
            for(List<Integer> list : res) {
                Set<Integer> set = new HashSet<>();
                for(int num : list) {
                    if(set.contains(num)) {
                        set.remove(num);
                    } else {
                        set.add(num);
                    }
                }
                if(set.size() <= 1) {
                    ans++;
                }
            }
            System.out.println(res);
            return ans;
        }
        private void preorder(TreeNode root, List<List<Integer>> res, LinkedList<Integer> path) {
            if(root == null)
                return;
            path.addLast(root.val);
            if(root.left == null && root.right == null) {
                res.add(new ArrayList<>(path));
            }
            preorder(root.left, res, path);
            preorder(root.right, res, path);
            path.removeLast();
        }
    }
}
