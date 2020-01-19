package com.zakcorp.stack.impl;

public class TwoStacks {
    private int size;
    private int[] arr;
    private int top1;
    private int top2;

    public TwoStacks(int size){
        arr = new int[size];
        this.size = size;
        top1 = -1;
        top2 = size;
    }

    public void push1(int x){
        if(top1 < top2 - 1){
            arr[++top1] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public void push2(int x){
        if(top1 < top2 - 1){
            arr[--top2] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public int pop1(){
        int x;
        if(top1 >= 0){
            x = arr[top1--];
        } else {
            System.out.println("Stack Underflow");
            x = -1;
        }
        return x;
    }

    public int pop2(){
        int x;
        if(top2 < size){
            x = arr[top2++];
        } else {
            System.out.println("Stack Underflow");
            x = -1;
        }
        return x;
    }
}
