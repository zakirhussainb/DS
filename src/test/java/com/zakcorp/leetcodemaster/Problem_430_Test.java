package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_430_Test {
    Problem_430 p = new Problem_430();
    @Test
    public void test0() {
        Problem_430.Node head = new Problem_430.Node(1);
        head.child = new Problem_430.Node(3);
        p.printDLL(p.flatten(head));
    }
    @Test
    public void test1() {
        Problem_430.Node head = new Problem_430.Node(1);
        head.prev = null;
        head.next = new Problem_430.Node(2);
        head.next.prev = head;
        head.child = new Problem_430.Node(3);
        p.printDLL(p.flatten(head));
    }
    @Test
    public void test2() {
        Problem_430.Node head = new Problem_430.Node(1);
        head.prev = null;
        head.next = new Problem_430.Node(2);
        head.next.prev = head;
        head.child = new Problem_430.Node(3);

        head.next.next = new Problem_430.Node(4);
        head.next.next.prev = head.next;
        head.next.next.child = new Problem_430.Node(5);
        p.printDLL(p.flatten(head));
    }
}
