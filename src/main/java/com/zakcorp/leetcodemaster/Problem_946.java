package com.zakcorp.leetcodemaster;

import java.util.Stack;

public class Problem_946
{
    static class Solver1 {
        public boolean solve1(int[] pushed, int[] popped){
            Stack<Integer> stack = new Stack<>();
            int n = pushed.length;
            int i = 0, j = 0;
            while(i < n || !stack.isEmpty()) {
                if(stack.isEmpty()) {
                    stack.push( pushed[ i ] );
                    i++;
                }
                if(!stack.isEmpty() && stack.peek() != popped[j]) {
                    if(i < n)
                        stack.push( pushed[i] );
                    else
                        return false;
                    i++;
                } else {
                    stack.pop();
                    j++;
                }
            }
            return j >= n;
        }
    }
}
