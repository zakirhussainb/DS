package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_B_Test {
    Problem_B.Solver p = new Problem_B.Solver();
    @Test
    public void test1() {
        assertEquals(10, p.solve1(4));
    }
}
