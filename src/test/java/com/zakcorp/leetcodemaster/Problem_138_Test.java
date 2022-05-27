package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_138_Test {
    Problem_138.Solver p = new Problem_138.Solver();
    @Test
    public void test1() {
        Problem_138.Node head = new Problem_138.Node(7);
        head.next = new Problem_138.Node(13);
        head.next.next = new Problem_138.Node(11);
        head.next.next.next = new Problem_138.Node(10);
        head.next.next.next.next = new Problem_138.Node(1);
        head.next.next.next.next.next = null;

        head.random = null;
        head.next.random = head;
        head.next.next.random = head.next.next.next.next;
        head.next.next.next.random = head.next.next;
        head.next.next.next.next.random = head;

        Problem_138.Node res = p.solve1(head);
        p.printList(res);
    }
}
