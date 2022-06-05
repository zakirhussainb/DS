package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertEquals(1, p.solve1(new int[]{1,3,5,2,4,8,2,2}));
    }
    @Test
    public void test2() {
        assertEquals(3, p.solve1(new int[]{3}));
    }

}
