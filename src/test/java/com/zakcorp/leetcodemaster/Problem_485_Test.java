package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_485_Test {
    Problem_485.Solver p = new Problem_485.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.solve1(new int[]{1,1,0,1,1,1}));
    }
}
