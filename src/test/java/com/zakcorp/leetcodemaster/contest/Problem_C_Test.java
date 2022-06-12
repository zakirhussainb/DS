package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_C_Test {
    Problem_C.Solver p = new Problem_C.Solver();
    @Test
    public void test1() {
        assertEquals(31, p.solve1(new int[]{8,15,10,20,8}, 2));
    }
    @Test
    public void test2() {
        assertEquals(7, p.solve1(new int[]{6,1,3,2,2,4,1,2}, 3));
    }
}
