package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1275_Test {
    Problem_1275.Solver p = new Problem_1275.Solver();
    @Test
    public void test1() {
        assertEquals("A", p.solve1(new int[][]{{0,0},{2,0},{1,1},{2,1},{2,2}}));
    }
}
