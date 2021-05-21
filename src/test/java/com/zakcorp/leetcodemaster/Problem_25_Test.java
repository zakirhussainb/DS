package com.zakcorp.leetcodemaster;

import com.zakcorp.final450.linkedlist.P_127;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_25_Test {
    Problem_25.Solver p = new Problem_25.Solver();
    @Test
    public void test1() {
        Problem_25.ListNode head = new Problem_25.ListNode(10);
        head.next = new Problem_25.ListNode(20);
        head.next.next = new Problem_25.ListNode(30);
        head.next.next.next = new Problem_25.ListNode(40);
        head.next.next.next.next = new Problem_25.ListNode(50);
        p.printList( head, "Input is" );
        p.printList( p.solve1(head, 1), "Output is" );
    }
}
