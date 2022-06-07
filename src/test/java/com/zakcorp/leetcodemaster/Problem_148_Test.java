package com.zakcorp.leetcodemaster;

import org.junit.Test;

public class Problem_148_Test {
    Problem_148.Solver p = new Problem_148.Solver();
    @Test
    public void test1() {
        Problem_148.ListNode head = new Problem_148.ListNode(4);
        head.next = new Problem_148.ListNode(1);
        head.next.next = new Problem_148.ListNode(3);
        head.next.next.next = new Problem_148.ListNode(2);
        head.next.next.next.next = new Problem_148.ListNode(5);

        System.out.println("List before sorting... ");
        p.printList(head);

        Problem_148.ListNode result = new Problem_148.ListNode(1);
        result.next = new Problem_148.ListNode(2);
        result.next.next = new Problem_148.ListNode(3);
        result.next.next.next = new Problem_148.ListNode(4);
        result.next.next.next.next = new Problem_148.ListNode(5);

        System.out.println("\nList after sorting... ");
        p.printList(p.sortList(head));
    }
}
