package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_328_Test {
    Problem_328.Solver p = new Problem_328.Solver();
    @Test
    public void test1() {
        Problem_328.ListNode head = new Problem_328.ListNode(1);
        head.next = new Problem_328.ListNode(2);
        head.next.next = new Problem_328.ListNode(3);
        head.next.next.next = new Problem_328.ListNode(4);
        head.next.next.next.next = new Problem_328.ListNode(5);

        p.solve1(head);
        p.printList(head);
    }
}
