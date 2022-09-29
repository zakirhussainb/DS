package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_1701_Test {
    Problem_1701.Solver p = new Problem_1701.Solver();
    @Test
    public void test1() {
        assertEquals(3.25000, p.solve1(new int[][]{ {5,2},{5,4},{10,3},{20,1} }), 1.0);
    }
}
