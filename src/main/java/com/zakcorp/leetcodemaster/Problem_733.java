package com.zakcorp.leetcodemaster;

import java.util.LinkedList;
import java.util.Queue;
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
            int color = image[sr][sc];
            Stack<int[]> stack = new Stack<>();
            stack.push(new int[]{sr, sc});
            while( !stack.isEmpty() ) {
                int[] colorIndex = stack.pop();
                int x = colorIndex[0];
                int y = colorIndex[1];
                if( image[x][y] == color ) {
                    image[x][y] = newColor;
                    if(x + 1 < image.length)
                        stack.push(new int[]{x + 1, y});
                    if(y + 1 < image[0].length)
                        stack.push(new int[]{x, y + 1});
                    if(x - 1 >= 0)
                        stack.push(new int[]{x - 1, y});
                    if(y - 1 >= 0)
                        stack.push(new int[]{x, y - 1});
                }
            }
            return image;
        }
    }

    static class BFS {
        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
            int color = image[sr][sc];
            if(color == newColor)
                return image;
            Queue<int[]> queue = new LinkedList<>();
            queue.add(new int[]{sr, sc});
            while( !queue.isEmpty() ) {
                int[] colorIndex = queue.poll();
                int x = colorIndex[0];
                int y = colorIndex[1];
                if(image[x][y] == color) {
                    image[x][y] = newColor;
                    if(x + 1 < image.length)
                        queue.add(new int[]{x + 1, y});
                    if(x - 1 >= 0)
                        queue.add(new int[]{x - 1, y});
                    if(y + 1 < image[0].length)
                        queue.add(new int[]{x, y + 1});
                    if(y - 1 >= 0)
                        queue.add(new int[]{x, y - 1});
                }
            }
            return image;
        }
    }
}
