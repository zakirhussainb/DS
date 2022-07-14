package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_994_Test {
    Problem_994.Solver p = new Problem_994.Solver();
    @Test
    public void test1() {
        assertEquals(4, p.solve1(new int[][]{{2,1,1},{1,1,0},{0,1,1}}));
    }
}
