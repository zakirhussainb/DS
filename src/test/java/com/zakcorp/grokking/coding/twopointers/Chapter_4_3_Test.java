package com.zakcorp.grokking.coding.twopointers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Chapter_4_3_Test {
    Chapter_4_3 p = new Chapter_4_3();
    @Test
    public void test1() {
        Chapter_4_3.ListNode head = new Chapter_4_3.ListNode(1);
        head.next = new Chapter_4_3.ListNode(2);
        head.next.next = new Chapter_4_3.ListNode(3);
        head.next.next.next = new Chapter_4_3.ListNode(4);
        head.next.next.next.next = new Chapter_4_3.ListNode(5);
        head.next.next.next.next.next = new Chapter_4_3.ListNode(6);
        head.next.next.next.next.next.next = head.next.next;
        assertEquals(head.next.next, p.findCycleStart(head));
    }
}
