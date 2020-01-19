package com.zakcorp.stack.impl;

import java.util.Stack;

public class SpecialStack extends Stack<Integer>{
    Stack<Integer> minStack = new Stack<>();
    public void push(int x){
        if (isEmpty()) {
            super.push(x);
            minStack.push(x);
        } else {
            super.push(x);
            int y = minStack.pop();
            minStack.push(y);
            minStack.push(Math.min(x, y));
        }
    }

    public Integer pop(){
        int x = super.pop();
        minStack.pop();
        return x;
    }

    public int getMin(){
        int x = minStack.pop();
        minStack.push(x);
        return x;
    }











    /* My Initial Implementation */

    /* In special stack all operations are O(1) *//*
    Stack<Integer> stack;
    Stack<Integer> auxStack;
    public SpecialStack(){
        stack = new Stack<>();
        auxStack = new Stack<>();
    }
    public void push(int x){
//        if(stack.isFull()){
//            System.out.println("Stack is Full....");
//            return;
//        }
        stack.push(x);
        if(!auxStack.isEmpty() && auxStack.peek() < x){
            int y = auxStack.pop();
            auxStack.push(Math.min(x, y));
        } else {
            auxStack.push(x);
        }
    }

    public int pop(){
        int x = -1;
        if(stack.isEmpty()){
            System.out.println("Stack is Empty....");
            return x;
        }
        auxStack.pop();
        x = stack.pop();
        return x;
    }

    public boolean isEmpty(){
        return stack.size() == 0;
    }

    public boolean isFull(){
        return false;
    }

    public int getMin(){
        int x = -1;
        if(stack.isEmpty() || auxStack.isEmpty()){
            System.out.println("Stack is Empty");
            return x;
        }
        return auxStack.pop();
    }*/


}
