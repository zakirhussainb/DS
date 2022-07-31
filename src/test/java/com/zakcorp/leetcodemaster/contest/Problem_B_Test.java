package com.zakcorp.leetcodemaster.contest;

import com.zakcorp.leetcodemaster.classes.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_B_Test {
    Problem_B.Solver p = new Problem_B.Solver();
    @Test
    public void test1() {
        assertEquals(3,
                p.solve1(new int[]{10,6,12,7,3,5}));
    }
}
