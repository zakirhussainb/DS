package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_11 {
    static class Solver {
        public int solve1(int[] height) {
            int maxArea = 0;
            int n = height.length;
            for(int i = 0; i < n; i++) {
                for(int j = i + 1; j < n; j++) {
                    int minHeight = Math.min(height[i], height[j]);
                    int widthOfContainer = j - i;
                    int currArea = minHeight * widthOfContainer;
                    maxArea = Math.max(maxArea, currArea);
                }
            }
            return maxArea;
        }
        public int solve2(int[] height) {
            int maxArea = 0;
            int n = height.length;
            int left = 0, right = n - 1;
            while(left < right) {
                int minHeight = Math.min(height[left], height[right]);
                int widthOfContainer = right - left;
                int currArea = minHeight * widthOfContainer;
                maxArea = Math.max(maxArea, currArea);
                if(height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
            }
            return maxArea;
        }
    }
}
