package com.zakcorp.test;

import java.util.*;

public class GeneralTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        Stack<Integer> stack = new Stack<>();
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
        System.out.println(pQueue.peek());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.peek());
        HashSet<Integer> hSet = new HashSet<>();
    }
}
