package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[][]{{1,6},{2,3},{3,2},{4,6}}, p.solve1( new int[][] { {1,2},{2,3},{4,5} },
                                                                          new int[][] { {1,4},{3,2},{4,1} }));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[][]{{1,3},{2,4},{3,6},{4,3},{5,5}}, p.solve1( new int[][] { {2,4},{3,6},{5,5} },
                                                                          new int[][] { {1,3},{4,3} }));
    }
}
