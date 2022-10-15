package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1381 {
    static class CustomStack {
        private final int maxSize;
        private final int[] arr;
        private int top;
        public CustomStack(int maxSize) {
            this.maxSize = maxSize;
            arr = new int[maxSize];
            top = 0;
        }

        public void push(int x) {
            if(isFull())
                return;
            arr[top++] = x;
        }

        public int pop() {
            if(isEmpty())
                return -1;
            int val = arr[--top];
            arr[top] = 0;
            return val;
        }

        public void increment(int k, int val) {
            for(int i = 0; i < top; i++) {
                if(i < k) {
                    arr[i] += val;
                }
            }
        }

        private boolean isFull() {
            return top >= maxSize;
        }

        private boolean isEmpty() {
            return top <= 0;
        }
    }
}
