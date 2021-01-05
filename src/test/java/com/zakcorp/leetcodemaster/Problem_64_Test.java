package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_64_Test {
    Problem_64.Solver p = new Problem_64.Solver();
    Problem_64.Solver1 p1 = new Problem_64.Solver1();
//    Problem_64.Solver2 p2 = new Problem_64.Solver2();
    @Test
    public void test1() {
        assertEquals(7, p.solve1(new int[][]{{1,3,1},{1,5,1},{4,2,1}}));
        assertEquals(7, p1.solve1(new int[][]{{1,3,1},{1,5,1},{4,2,1}}));
    }
    @Test
    public void test2() {
        assertEquals(12, p.solve1(new int[][]{{1,2,3},{4,5,6}}));
//        assertEquals(12, p1.solve1(new int[][]{{1,2,3},{4,5,6}}));
    }
}
