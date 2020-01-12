package com.zakcorp.test;

import java.util.*;

public class GeneralTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        Stack<Integer> stack = new Stack<>();
        stack.add(10);
        stack.add(20);
        stack.add(15);
//        System.out.println(pQueue.poll());
        System.out.println(stack.peek());
        System.out.println(stack.search(10));
    }
}
