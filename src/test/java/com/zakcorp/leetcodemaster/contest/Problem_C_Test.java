package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_C_Test {
    Problem_C.Solver p = new Problem_C.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{2,2,1,0}, p.solve1(new String[]{"102","473","251","814"},
                new int[][] { {1,1},{2,3},{4,2},{1,2} }));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{3,0}, p.solve1(new String[]{"24","37","96","04"},
                new int[][] { {2,1},{2,2} }));
    }
    @Test
    public void test3() {
        assertArrayEquals(new int[]{3,0}, p.solve1(new String[]{"9415","5908","1840","5307"},
                new int[][] { {3,2},{2,2},{3,3},{1,3} }));
    }
}
