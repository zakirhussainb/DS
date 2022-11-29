package com.zakcorp.leetcodemaster;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Problem_1828_Test
{
    Problem_1828.Solver p = new Problem_1828.Solver();
    Problem_1828.Solver1 p1 = new Problem_1828.Solver1();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{3,2,2}, p.solve1(new int[][]{{1,3},{3,3},{5,3},{2,2}},
                                                     new int[][]{{2,3,1},{4,3,1},{1,1,2}}));


        assertArrayEquals(new int[]{3,2,2}, p1.solve1(new int[][]{{1,3},{3,3},{5,3},{2,2}},
                                                     new int[][]{{2,3,1},{4,3,1},{1,1,2}}));
    }
}
