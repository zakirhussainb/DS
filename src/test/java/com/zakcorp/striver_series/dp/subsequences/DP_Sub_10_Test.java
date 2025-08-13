package com.zakcorp.striver_series.dp.subsequences;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DP_Sub_10_Test {
    DP_Sub_10.Recursion p1 = new DP_Sub_10.Recursion();
    DP_Sub_10.Memoization p2 = new DP_Sub_10.Memoization();
    @Test
    public void test1() {
        assertEquals(27, p1.solve1(new int[]{2, 4, 6}, new int[]{5, 11, 13},3, 10));
        assertEquals(27, p2.solve1(new int[]{2, 4, 6}, new int[]{5, 11, 13},3, 10));
    }
    @Test
    public void test2() {
        assertEquals(110, p1.solve1(new int[]{1, 3, 4, 5}, new int[]{10, 40, 50, 70},4, 8));
        assertEquals(110, p2.solve1(new int[]{1, 3, 4, 5}, new int[]{10, 40, 50, 70},4, 8));
    }
    @Test
    public void test3() {
        assertEquals(360, p1.solve1(new int[]{10, 20, 30}, new int[]{60, 100, 120},3, 60));
        assertEquals(360, p2.solve1(new int[]{10, 20, 30}, new int[]{60, 100, 120},3, 60));
    }
}
