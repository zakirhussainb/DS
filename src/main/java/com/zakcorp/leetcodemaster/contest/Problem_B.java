package com.zakcorp.leetcodemaster.contest;

import java.util.HashMap;
import java.util.Map;

public class Problem_B {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    static class Solver {

        // for each node in the tree, we will maintain three values
        class State {
            // count of nodes in the subtree
            int nodeCount;

            // sum of values in the subtree
            int valueSum;

            // max average found in the subtree
            int average;

            State(int nodes, int sum, int average) {
                this.nodeCount = nodes;
                this.valueSum = sum;
                this.average = average;
            }
        }

        public int solve1(TreeNode root) {
            int[] counter = new int[]{0};
            helper(root, counter);
            return counter[0];
        }

        private State helper(TreeNode root, int[] counter) {

            if (root == null) {
                return new State(0, 0, 0);
            }

            // postorder traversal, solve for both child nodes first.
            State left = helper(root.left, counter);
            State right = helper(root.right, counter);

            // now find nodeCount, valueSum and maxAverage for current node `root`
            int nodeCount = left.nodeCount + right.nodeCount + 1;
            int sum = left.valueSum + right.valueSum + root.val;
            int average = sum / nodeCount;

            if(average == root.val) {
                counter[0]++;
            }

            return new State(nodeCount, sum, average);
        }
    }
}
