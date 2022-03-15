package com.zakcorp.leetcodemaster;

public class Problem_733 {
    static class Solver {
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
}
