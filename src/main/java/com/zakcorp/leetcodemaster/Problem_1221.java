package com.zakcorp.leetcodemaster;
import java.util.*;
public class Problem_1221 {
    // This problem can also be used to find the number of balanced pairs, such as,
    // (()()())(()()) - Balanced pairs are '2'
    static class Solver {
        // Using a Stack here
        public int balancedStringSplit(String str) {
            int noOfPairs = 0;
            int n = str.length();
            Stack<Character> stack = new Stack<>();
            for(int i = 0; i < n; i++) {
                if(stack.isEmpty() || stack.peek() == str.charAt(i)) {
                    stack.push(str.charAt(i));
                } else {
                    stack.pop();
                }
                if(stack.isEmpty()) {
                    noOfPairs++;
                }
            }
            return noOfPairs;
        }
    }
    static class Solver1 {
        public int balancedStringSplit(String str) {
            int sum = 0;
            int noOfPairs = 0;
            int n = str.length();
            for(int i = 0; i < n; i++) {
                if(str.charAt(i) == 'L') {
                    sum -= 1;
                } else {
                    sum += 1;
                }
                // When there are equals no. of 'L' and 'R' the sum is equal to '0'
                if(sum == 0) {
                    noOfPairs++;
                }
            }
            return noOfPairs;
        }
    }
}
