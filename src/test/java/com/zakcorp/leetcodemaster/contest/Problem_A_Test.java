package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
//        assertEquals( 1, p.solve1(new int[]{2,-1,1}));
        assertEquals( 1, p.solve2(new int[]{2,-1,1}));
    }
    @Test
    public void test2() {
//        assertEquals( 1, p.solve1(new int[]{-4,-2,1,4,8}));
        assertEquals( 1, p.solve2(new int[]{-4,-2,1,4,8}));
    }
    @Test
    public void test3() {
//        assertEquals( 1, p.solve1(new int[]{2,1,1,-1,100000}));
        assertEquals( 1, p.solve2(new int[]{2,1,1,-1,100000}));
    }
    @Test
    public void test4() {
//        assertEquals( -10, p.solve1(new int[]{-10,-12,-54,-12,-544,-10000}));
        assertEquals( -10, p.solve2(new int[]{-10,-12,-54,-12,-544,-10000}));
    }
    @Test
    public void test5() {
        assertEquals( 100000, p.solve2(new int[]{-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000,-100000,100000}));
    }
}
