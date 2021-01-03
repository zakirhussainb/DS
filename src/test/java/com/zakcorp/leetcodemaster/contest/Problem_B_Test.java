package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_B_Test {
    Problem_B.Solver p = new Problem_B.Solver();
    @Test
    public void test1() {
        assertEquals(4, p.solve1(new int[]{1,3,5,7,9}));
    }
    @Test
    public void test2() {
        assertEquals(15, p.solve1(new int[]{1,1,1,3,3,3,7}));
    }
}
