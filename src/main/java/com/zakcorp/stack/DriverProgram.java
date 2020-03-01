package com.zakcorp.stack;

import com.zakcorp.linkedlists.singly.SinglyLLIntImpl;
import com.zakcorp.linkedlists.singly.SinglyLLProblemsLC;
import com.zakcorp.stack.impl.QueueUsingStacks;
import com.zakcorp.stack.impl.TwoStacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class DriverProgram {
    public static void main(String[] args) {
        /*StackI<Integer> stack = new LLStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.print();
        int pop = stack.pop();
        System.out.println("pop..." + pop);
        stack.print();
        System.out.println(stack.peek());
        stack.print();
        System.out.println(stack.peek(3));
        stack.print();*/

        /*StackI<Integer> stArr = new ArrayStack<>();
        stArr.push(10);
        stArr.push(20);
        stArr.push(30);
        stArr.push(40);
        stArr.push(50);
        stArr.push(60);
        stArr.print();
        System.out.println(stArr.peek(3));*/

        /*SpecialStack splStack = new SpecialStack();
        splStack.push(10);
        splStack.push(20);
        splStack.push(30);
        int n = splStack.pop();
        splStack.push(5);
        splStack.push(4);
        splStack.push(3);
        int y = splStack.getMin();
        splStack.pop();
        int l = splStack.getMin();
        System.out.println("y..." + y);
        System.out.println("l..." + l);
        splStack.pop();
        int l1 = splStack.getMin();
        System.out.println("l1..." + l1);*/

        /*TwoStacks twoStacks = new TwoStacks(5);
        twoStacks.push1(1);
        twoStacks.push1(2);
        twoStacks.push2(3);
        twoStacks.push2(4);
        twoStacks.push1(5);
        twoStacks.push1(6);
        twoStacks.pop1();
        twoStacks.pop2();
        twoStacks.pop1();
        twoStacks.pop2();
        twoStacks.pop1();
        twoStacks.pop2();*/

//        QueueUsingStacks queue = new QueueUsingStacks();
//        queue.enQueue(10);
//        queue.enQueue(20);
//        queue.enQueue(30);
//        Deque<Integer> dq = new LinkedList<>();
//        dq.addFirst(7);
//        dq.addFirst(9);
//        dq.addFirst(11);
//        dq.addFirst(13);
//
//        Deque<Integer> arrDq = new ArrayDeque<>();
//        arrDq.addFirst(7);
//        arrDq.addFirst(9);
//        arrDq.pollFirst();
//        arrDq.peekFirst();
        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        Stack<Integer> stack1 = new Stack<>();
        Deque<Integer> deque = new ArrayDeque<>();
        deque.poll();
        deque.add(10);



    }
}
