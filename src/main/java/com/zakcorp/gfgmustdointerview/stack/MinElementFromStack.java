package com.zakcorp.gfgmustdointerview.stack;

import java.util.Stack;

public class MinElementFromStack {
    int minEle;
    Stack<Integer> stack;

    public int getMin(){
        return minEle;
    }
    public int pop(){
        return stack.pop();
    }
    public void push(int x){
        if(!stack.isEmpty() && x < stack.peek()){
            minEle = x;
        } else {
            stack.push(x);
        }
    }
    public static void main(String[] args) {
//        MinElementFromStack p = new MinElementFromStack();
//        push(10);
//        p.push(20);
//        p.push(30);

    }

}
