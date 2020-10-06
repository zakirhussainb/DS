package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_143_Test {
    Problem_143 p = new Problem_143();
    @Test
    public void test1() {
        Problem_143.ListNode input = new Problem_143.ListNode(1);
        input.next = new Problem_143.ListNode(2);
        input.next.next = new Problem_143.ListNode(3);
        input.next.next.next = new Problem_143.ListNode(4);
        p.reorderList(input);
    }
}
