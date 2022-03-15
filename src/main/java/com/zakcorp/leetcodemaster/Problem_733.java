package com.zakcorp.leetcodemaster;

import java.util.Stack;

/**
 * There are three ways to solve this problem and knowing all of them is mandatory in order to understand the problem
 * and its solution better
 *  1. DFS - Recursive
 *  2. DFS - Iterative using Stack
 *  3. BFS - Iterative Using Queue
 */
public class Problem_733 {
    static class DFSRecursive {
        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
            if(image[sr][sc] == newColor) {
                return image;
            }
            fillImage(image, sr, sc, image[sr][sc], newColor);
            return image;
        }
        private void fillImage(int[][] image, int sr, int sc, int color, int newColor) {
            if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) {
                return;
            }
            if(image[sr][sc] != color) {
                return;
            }
            image[sr][sc] = newColor;
            fillImage(image, sr + 1, sc, color, newColor);
            fillImage(image, sr - 1, sc, color, newColor);
            fillImage(image, sr, sc + 1, color, newColor);
            fillImage(image, sr, sc - 1, color, newColor);
        }
    }

    static class DFSIterative {
        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
            if(image[sr][sc] == newColor) {
                return image;
            }
            Stack<Integer> stack = new Stack<>();
            stack.push(image[sr][sc]);
            while(stack.isEmpty()) {

            }
            return image;
        }
    }
}
