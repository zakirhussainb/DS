package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_1290_Test {
    Problem_1290.Solver p = new Problem_1290.Solver();
    @Test
    public void test1() {
        Problem_1290.ListNode node = new Problem_1290.ListNode(1);
        node.next = new Problem_1290.ListNode(0);
        node.next.next = new Problem_1290.ListNode(1);
//        assertEquals(5, p.solve1(node));
        assertEquals(5, p.solve2(node));
    }
}
