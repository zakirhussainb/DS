package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.TreeNode;

import java.util.*;

public class Problem_654
{
    static class Solver {
        public TreeNode solve1( int[] arr) {
            if(arr.length == 0)
                return null;
            int maxIndex = findMaxIndex(arr);
            TreeNode root = new TreeNode(arr[maxIndex]);
            int[] leftArr = Arrays.copyOfRange(arr, 0, maxIndex);
            int[] rightArr = Arrays.copyOfRange(arr, maxIndex + 1, arr.length);
            root.left = solve1( leftArr );
            root.right = solve1( rightArr );
            return root;
        }
        private int findMaxIndex(int[] arr) {
            int max = Integer.MIN_VALUE;
            int maxIndex = -1;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] > max) {
                    max = arr[i];
                    maxIndex = i;
                }
            }
            return maxIndex;
        }
    }
}
