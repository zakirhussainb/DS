package com.zakcorp.leetcodemaster;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Problem_1314_Test
{
    Problem_1314.Solver p = new Problem_1314.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[][]{{12,21,16},{27,45,33},{24,39,28}},
                          p.solve1(new int[][]{{1,2,3},{4,5,6},{7,8,9}}, 1));
    }
}
