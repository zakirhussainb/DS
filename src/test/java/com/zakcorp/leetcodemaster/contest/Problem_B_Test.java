package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_B_Test {
    Problem_B.Solver p = new Problem_B.Solver();
    @Test
    public void test1() {
        assertEquals(2,
                p.solve1(new int[]{4,7,9}, new int[]{8,2,5,8}));
    }
    @Test
    public void test2() {
        assertEquals(1,
                     p.solve1(new int[]{1,1,1}, new int[]{10}));
    }
    @Test
    public void test3() {
        assertEquals(3,
                     p.solve1(new int[]{2,3,1,1,3}, new int[]{2,4,2}));
    }
}
