package com.zakcorp.leetcodemaster;

import com.zakcorp.grokking.coding.twopointers.Chapter_4_2_1;
import com.zakcorp.linkedlists.singly.SinglyLLIntImpl;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Problem_141_Test {
    Problem_141.Solver p = new Problem_141.Solver();
    Chapter_4_2_1 p1 = new Chapter_4_2_1();
    @Test
    public void test1() {
        SinglyLLIntImpl.Node head = new SinglyLLIntImpl.Node(1);
        head.next = new SinglyLLIntImpl.Node(2);
        head.next.next = new SinglyLLIntImpl.Node(3);
        head.next.next.next = new SinglyLLIntImpl.Node(4);
        head.next.next.next.next = new SinglyLLIntImpl.Node(5);
        head.next.next.next.next.next = head.next.next;
        assertTrue(p.solve1(head));
        assertTrue(p.solve2(head));
    }
    @Test
    public void test2() {
        Chapter_4_2_1.ListNode head = new Chapter_4_2_1.ListNode(1);
        head.next = new Chapter_4_2_1.ListNode(2);
        head.next.next = new Chapter_4_2_1.ListNode(3);
        head.next.next.next = new Chapter_4_2_1.ListNode(4);
        head.next.next.next.next = new Chapter_4_2_1.ListNode(5);
        head.next.next.next.next.next = new Chapter_4_2_1.ListNode(6);
        head.next.next.next.next.next.next = head.next.next;
        assertTrue(p1.hasCycle(head));
    }


}
