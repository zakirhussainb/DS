package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Problem_1120
{
    static class Solver {
        public double solve1( TreeNode root) {
            double[] res = {0.0};
            postorder(root, res);
            return res[0];
        }
        private int postorder(TreeNode root, double[] res) {
            if(root == null)
                return -1;
            if(root.left == null && root.right == null) {
                res[0] = Math.max( res[0], root.val );
                return root.val;
            }
            int left = postorder( root.left, res );
            int right = postorder( root.right, res );
            double curr = 0;
            if (left == -1.0)
                curr = (double) (root.val + right) / 2;
            else if (right == -1.0)
                curr = (double)(root.val + left) / 2;
            else
                curr = (double)(root.val + left + right) / 3;
            res[0] = Math.max( res[0], curr );
            return (int)curr;
        }
    }
}
