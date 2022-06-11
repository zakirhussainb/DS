package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.ListNode;
import com.zakcorp.leetcodemaster.util.CommonUtility;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_23_Test {
    Problem_23.Solver p = new Problem_23.Solver();
    Problem_23.Solver1 p1 = new Problem_23.Solver1();
    CommonUtility util = new CommonUtility();
    @Test
    public void test1() {
        ListNode output = new ListNode(1);
        output.next = new ListNode(1);
        output.next.next = new ListNode(2);
        output.next.next.next = new ListNode(3);
        output.next.next.next.next = new ListNode(4);
        output.next.next.next.next.next = new ListNode(4);
        output.next.next.next.next.next.next = new ListNode(5);
        output.next.next.next.next.next.next.next = new ListNode(6);
        ListNode[] listsArr = new ListNode[5];

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        ListNode l4 = new ListNode(7);
        l4.next = new ListNode(8);

        ListNode l5 = new ListNode(9);
        l5.next = new ListNode(10);

        listsArr[0] = l1;
        listsArr[1] = l2;
        listsArr[2] = l3;
        listsArr[3] = l4;
        listsArr[4] = l5;
//        assertTrue(util.areListsSame(output, p.solve1(listsArr)));
        assertTrue(util.areListsSame(output, p1.solve1(listsArr)));
    }

}
