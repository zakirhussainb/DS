package com.zakcorp.final450.stacksandqueues;

public class P_275 {
    static class TwoStack {
        int size;
        int top1, top2;
        int[] arr = new int[100];
        public TwoStack() {
            size = 100;
            top1 = -1;
            top2 = size;
        }
    }
    static class Stacks {
        public void push1(int x, TwoStack sq) {
            if(sq.top1 < sq.top2 - 1) {
                sq.arr[++sq.top1] = x;
            }
        }

        public void push2(int x, TwoStack sq) {
            if(sq.top1 < sq.top2 - 1) {
                sq.arr[--sq.top2] = x;
            }
        }

        public int pop1(TwoStack sq) {
            if(sq.top1 >= 0)
                return sq.arr[sq.top1--];
            else
                return -1;
        }

        public int pop2(TwoStack sq) {
            if(sq.top2 < sq.size)
                return sq.arr[sq.top2++];
            else
                return -1;
        }
    }
}
