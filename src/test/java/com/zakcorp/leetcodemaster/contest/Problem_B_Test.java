package com.zakcorp.leetcodemaster.contest;

import com.zakcorp.leetcodemaster.classes.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_B_Test {
    Problem_B.Solver p = new Problem_B.Solver();
    ListNode z = new ListNode();
    @Test
    public void test1() {
        ListNode head = new ListNode(3);
        int[] arr = {0,2,6,8,1,7,9,4,2,5,5,0};
        for(int i = 0; i < arr.length; i++) {
            z.addLast(head, arr[i]);
        }
        assertArrayEquals(new int[][]{{3,0,2,6,8},{5,0,-1,-1,1},{5,2,4,9,7}},
                p.solve1(3, 5, head));
    }
}
