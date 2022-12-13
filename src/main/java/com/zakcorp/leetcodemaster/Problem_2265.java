package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Problem_2265
{
    static class Solver {
        public int solve1( TreeNode root) {
            int[] countAvgEqualNodes = { 0 };
            postorder(root, countAvgEqualNodes);
            return countAvgEqualNodes[0];
        }
        private int[] postorder(TreeNode root, int[] countAvgEqualNodes) {
            if(root == null)
                return new int[]{-1, -1};
            int[] leftNode = postorder( root.left, countAvgEqualNodes );
            int[] rightNode = postorder( root.right, countAvgEqualNodes );
            int x = root.val;
            if(leftNode[0] == -1 && rightNode[0] == -1) {
                countAvgEqualNodes[0]++;
                return new int[]{x, 1};
            }
            if(leftNode[0] != -1)
                x += leftNode[0];
            if(rightNode[0] != -1)
                x += rightNode[0];

            int totalNodes = 0;
            if(leftNode[1] != -1)
                totalNodes += leftNode[1];
            if(rightNode[1] != -1)
                totalNodes += rightNode[1];
            totalNodes += 1;

            int avg = x / totalNodes;
            if(avg == root.val)
                countAvgEqualNodes[0]++;
            return new int[]{x, totalNodes};
        }
    }
}
