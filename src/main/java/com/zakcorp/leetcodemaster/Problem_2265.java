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

    static class Solver1 {
        // for each node in the tree, we will maintain three values
        static class State {
            // count of nodes in the subtree
            int nodeCount;
            // sum of values in the subtree
            int sum;
            // max average found in the subtree
            int avg;
            public State(int nodeCount, int sum, int avg) {
                this.nodeCount = nodeCount;
                this.sum = sum;
                this.avg = avg;
            }
        }

        public int averageOfSubtree(TreeNode root) {
            int[] counter = { 0 };
            postorder(root, counter);
            return counter[0];
        }

        private State postorder(TreeNode root, int[] counter) {
            if(root == null) {
                return new State( 0, 0, 0 );
            }
            // postorder traversal, solve for both child nodes first.
            State left = postorder( root.left, counter );
            State right = postorder( root.right, counter );

            // now find nodeCount, valueSum and maxAverage for current node `root`
            int nodeCount = left.nodeCount + right.nodeCount + 1;
            int sum = left.sum + right.sum + root.val;
            int average = sum / nodeCount;
            if(average == root.val) {
                counter[0]++;
            }
            return new State( nodeCount, sum, average );
        }
    }
}
