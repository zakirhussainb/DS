package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertEquals( "Heavy", p.solve1(1000, 35, 700, 300));
    }
    @Test
    public void test2() {
        assertEquals( "Neither", p.solve1(200, 50, 800, 50));
    }
    @Test
    public void test3() {
        assertEquals( "Both", p.solve1( 2909, 3968, 3272, 727 ) );
    }
}
