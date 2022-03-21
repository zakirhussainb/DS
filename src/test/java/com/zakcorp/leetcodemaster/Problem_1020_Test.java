package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_1020_Test {
    Problem_1020.Solver p = new Problem_1020.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.solve1(new int[][]{
                {0,0,0,0},
                {1,0,1,0},
                {0,1,1,0},
                {0,0,0,0}}));
    }
}
