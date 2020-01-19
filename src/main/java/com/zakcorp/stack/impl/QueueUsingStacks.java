package com.zakcorp.stack.impl;

import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public QueueUsingStacks(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    public void enQueue(int x){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public int deQueue(){
        if(s1.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return s1.pop();
    }
}
