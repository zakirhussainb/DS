package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Problem_1038
{
    /*
    Using Recursion
     */
    static class Solver {
        public TreeNode solve1(TreeNode root) {
            reverseInOrder(root, new int[]{0});
            return root;
        }
        private void reverseInOrder(TreeNode root, int[] sum) {
            if(root == null)
                return;
            reverseInOrder( root.right, sum );
            sum[0] += root.val;
            root.val = sum[0];
            reverseInOrder( root.left, sum );
        }
    }

    static class Solver1 {

    }
}
