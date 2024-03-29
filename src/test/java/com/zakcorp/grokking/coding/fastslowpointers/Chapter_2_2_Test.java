package com.zakcorp.grokking.coding.fastslowpointers;

import com.zakcorp.grokking.coding.fastslowpointers.Chapter_2_2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Chapter_2_2_Test {
    Chapter_2_2 p = new Chapter_2_2();
    @Test
    public void test2() {
        Chapter_2_2.ListNode head = new Chapter_2_2.ListNode(1);
        head.next = new Chapter_2_2.ListNode(2);
        head.next.next = new Chapter_2_2.ListNode(3);
        head.next.next.next = new Chapter_2_2.ListNode(4);
        head.next.next.next.next = new Chapter_2_2.ListNode(5);
        head.next.next.next.next.next = new Chapter_2_2.ListNode(6);
        head.next.next.next.next.next.next = head.next.next;
        assertEquals(4, p.detectCycleAndGetLength(head));
    }
}
