package com.zakcorp.codechef.beginner;

import java.util.*;

class VALIDSTK {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int n = in.readInt();
                int[] arr = new int[n];
                for(int i = 0; i < n; i++) {
                    arr[i] = in.readInt();
                }
                out.printLine(new Solver().solve1(arr, n));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(int[] arr, int n){
            Stack<Integer> stack = new Stack<>();
            for(int i = 0; i < n; i++) {
                if(arr[i] == 1) {
                    stack.push(arr[i]);
                } else if(arr[i] == 0) {
                    if(stack.isEmpty()) {
                        return "Invalid";
                    } else {
                        stack.pop();
                    }
                }
            }
            return "Valid";
        }
        public String solve1(int[] arr, int n) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < n; i++) {
                if(arr[i] == 1) {
                    sb.append(arr[i]);
                } else if(arr[i] == 0) {
                    if(sb.length() == 0) {
                        return "Invalid";
                    } else {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                }
            }
            return "Valid";
        }
    }
}
