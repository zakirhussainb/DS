package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertEquals(2.65000, p.solve1(new int[][]{{3,50},{7,10},{12,25}}, 10), 1);
    }
    @Test
    public void test2() {
        assertEquals(0.25000, p.solve1(new int[][]{{1,0},{4,25},{5,50}}, 2), 1);
    }
    @Test
    public void test3() {
        assertEquals(0.00000, p.solve1(new int[][]{{2,50}}, 0), 1);
    }
}
