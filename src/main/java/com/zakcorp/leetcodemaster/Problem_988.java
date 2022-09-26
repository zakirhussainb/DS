package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Problem_988 {
    static class Solver {
        String ans = "~";
        public String solve1(TreeNode root) {
            preorder(root, new StringBuilder());
            return ans;
        }
        private void preorder(TreeNode root, StringBuilder sb) {
            if(root == null)
                return;
            char ch = (char)(root.val + 'a');
            sb.insert(0, ch);
            if(root.left == null && root.right == null) {
                String str = sb.toString();
                if(str.compareTo(ans) < 0) {
                    ans = str;
                }
            }
            preorder(root.left, sb);
            preorder(root.right, sb);
            sb.deleteCharAt(0);
        }
    }
}
