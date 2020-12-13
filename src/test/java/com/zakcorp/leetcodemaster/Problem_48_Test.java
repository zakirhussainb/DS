package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_48_Test {
    Problem_48.Solver p = new Problem_48.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[][]{ {7,4,1},{8,5,2},{9,6,3} },
                p.solve1(new int[][]{ {1,2,3},{4,5,6},{7,8,9} }));

        assertArrayEquals(new int[][]{ {7,4,1},{8,5,2},{9,6,3} },
                p.solve2(new int[][]{ {1,2,3},{4,5,6},{7,8,9} }));
    }
}
