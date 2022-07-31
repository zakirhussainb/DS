package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertEquals(3,
                p.solve1(new int[]{1,5,0,3,5}) );
    }
    @Test
    public void test2() {
        assertEquals(0,
                p.solve1(new int[]{0}) );
    }
}
