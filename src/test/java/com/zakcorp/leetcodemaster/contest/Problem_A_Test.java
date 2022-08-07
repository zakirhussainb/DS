package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1(new int[]{0,1,4,6,7,10}, 3));
    }
    @Test
    public void test2() {
        assertEquals(2, p.solve1(new int[]{4,5,6,7,8,9}, 2));
    }
}
