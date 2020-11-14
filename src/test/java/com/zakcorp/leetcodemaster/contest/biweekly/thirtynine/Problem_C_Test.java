package com.zakcorp.leetcodemaster.contest.biweekly.thirtynine;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_C_Test {
    Problem_C.Solver p = new Problem_C.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.solve1(new int[]{14,4,18,1,15}, 3, 15, 9));
    }
}
