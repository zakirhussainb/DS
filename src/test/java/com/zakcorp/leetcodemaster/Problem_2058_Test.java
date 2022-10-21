package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_2058_Test {
    Problem_2058.Solver p = new Problem_2058.Solver();
    @Test
    public void test1() {
        ListNode head = new ListNode(5);
        head.addLast(head, 3);
        head.addLast(head, 1);
        head.addLast(head, 2);
        head.addLast(head, 5);
        head.addLast(head, 1);
        head.addLast(head, 2);
        assertArrayEquals(new int[]{1, 3}, p.solve1(head));
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(3);
        head.addLast(head, 1);
        assertArrayEquals(new int[]{-1, -1}, p.solve1(head));
    }
}
