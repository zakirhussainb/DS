package com.zakcorp.striver_series.dp.subsequences;

import org.junit.Test;

import static org.junit.Assert.*;

public class DP_Sub_4_Test {
    DP_Sub_4.Recursion p1 = new DP_Sub_4.Recursion();
    DP_Sub_4.Memoization p2 = new DP_Sub_4.Memoization();
    DP_Sub_4.Tabulation p3 = new DP_Sub_4.Tabulation();
    @Test
    public void test1() {
        assertEquals(3, p1.solve1(new int[]{2, 3, 5, 16, 8, 10}, 10));
        assertEquals(3, p2.solve1(new int[]{2, 3, 5, 16, 8, 10}, 10));
        assertEquals(3, p3.solve1(new int[]{2, 3, 5, 16, 8, 10}, 10));
    }
    @Test
    public void test2() {
        assertEquals(3, p1.solve1(new int[]{1, 2, 3, 4, 5}, 5));
        assertEquals(3, p2.solve1(new int[]{1, 2, 3, 4, 5}, 5));
        assertEquals(3, p3.solve1(new int[]{1, 2, 3, 4, 5}, 5));
    }
    @Test
    public void test3() {
        assertEquals(6, p1.solve1(new int[]{2, 2, 2, 2}, 4));
        assertEquals(6, p2.solve1(new int[]{2, 2, 2, 2}, 4));
        assertEquals(6, p3.solve1(new int[]{2, 2, 2, 2}, 4));
    }
}
