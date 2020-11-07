package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_21_Test {
    Problem_21.Solver p = new Problem_21.Solver();
    @Test
    public void test1() {
        Problem_21.ListNode head1 = new Problem_21.ListNode(1);
        head1.next = new Problem_21.ListNode(2);
        head1.next.next = new Problem_21.ListNode(3);

        Problem_21.ListNode head2 = new Problem_21.ListNode(1);
        head2.next = new Problem_21.ListNode(2);
        head2.next.next = new Problem_21.ListNode(3);

        Problem_21.ListNode head3 = new Problem_21.ListNode(1);
        head3.next = new Problem_21.ListNode(1);
        head3.next.next = new Problem_21.ListNode(2);
        head3.next.next.next = new Problem_21.ListNode(2);
        head3.next.next.next.next = new Problem_21.ListNode(3);
        head3.next.next.next.next.next = new Problem_21.ListNode(3);
        assertEquals(head3, p.solve1(head1, head2));
    }
}
