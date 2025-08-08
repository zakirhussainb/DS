package com.zakcorp.striver_series.dp.subsequences;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DP_Sub_6_Test {
    DP_Sub_6.Recursion p1 = new DP_Sub_6.Recursion();
    DP_Sub_6.Memoization p2 = new DP_Sub_6.Memoization();
    @Test
    public void test1() {
        assertEquals(220, p1.solve1(new int[]{10, 20, 30}, new int[]{60, 100, 120},3, 50));
        assertEquals(220, p2.solve1(new int[]{10, 20, 30}, new int[]{60, 100, 120},3, 50));
    }
    @Test
    public void test2() {
        assertEquals(90, p1.solve1(new int[]{5, 4, 6, 3}, new int[]{10, 40, 30, 50},4, 10));
        assertEquals(90, p2.solve1(new int[]{5, 4, 6, 3}, new int[]{10, 40, 30, 50},4, 10));
    }
    @Test
    public void test3() {
        assertEquals(60, p1.solve1(new int[]{1, 2, 3, 8, 7, 4}, new int[]{20, 5, 10, 40, 15, 25},6, 10));
        assertEquals(60, p2.solve1(new int[]{1, 2, 3, 8, 7, 4}, new int[]{20, 5, 10, 40, 15, 25},6, 10));
    }
}
