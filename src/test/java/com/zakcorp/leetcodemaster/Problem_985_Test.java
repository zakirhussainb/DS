package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_985_Test {
    Problem_985 p = new Problem_985();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{8, 6, 2, 4}, p.sumEvenAfterQueries(new int[]{1, 2, 3, 4}, new int[][]{{1,0},{-3,1},{-4,0},{2,3}}));
    }
}
