package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_234_Test {
    Problem_234.Solver p = new Problem_234.Solver();
    @Test
    public void test1() {
        Problem_234.ListNode head = new Problem_234.ListNode(1);
        head.next = new Problem_234.ListNode(2);
//        assertFalse(p.solve1(head));
        assertFalse(p.solve2(head));
    }
    @Test
    public void test2() {
        Problem_234.ListNode head = new Problem_234.ListNode(1);
        head.next = new Problem_234.ListNode(2);
        head.next.next = new Problem_234.ListNode(2);
        head.next.next.next = new Problem_234.ListNode(1);
//        assertTrue(p.solve1(head));
        assertTrue(p.solve2(head));
    }
}
