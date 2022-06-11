package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.ListNode;
import com.zakcorp.leetcodemaster.util.CommonUtility;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_19_Test {
    CommonUtility util = new CommonUtility();
    Problem_19.Solver p = new Problem_19.Solver();
    Problem_19.Solver1 p1 = new Problem_19.Solver1();
    @Test
    public void test1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode output = new ListNode(1);
        output.next = new ListNode(2);
        output.next.next = new ListNode(3);
        output.next.next.next = new ListNode(5);
//        assertTrue(pro.areListsSame(output, p.solve(head, 2)));
        assertTrue(util.areListsSame(output, p1.solve(head, 2)));
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(1);
        assertNull(p.solve(head, 1));
        assertNull(p1.solve(head, 1));
    }

    @Test
    public void test3() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        ListNode output = new ListNode(1);
        assertTrue(util.areListsSame(output, p.solve(head, 1)));
        assertTrue(util.areListsSame(output, p1.solve(head, 1)));
    }
}
