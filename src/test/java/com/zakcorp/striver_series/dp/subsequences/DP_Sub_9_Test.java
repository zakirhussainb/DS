package com.zakcorp.striver_series.dp.subsequences;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DP_Sub_9_Test {
    DP_Sub_9.Recursion p1 = new DP_Sub_9.Recursion();
    DP_Sub_9.Memoization p2 = new DP_Sub_9.Memoization();
    DP_Sub_9.Tabulation p3 = new DP_Sub_9.Tabulation();
    @Test
    public void test1() {
        assertEquals(4, p1.solve1(new int[]{2, 4,10}, 10));
        assertEquals(4, p2.solve1(new int[]{2, 4,10}, 10));
        assertEquals(4, p3.solve1(new int[]{2, 4,10}, 10));
    }

    @Test
    public void test2() {
        assertEquals(1, p1.solve1(new int[]{5}, 5));
        assertEquals(1, p2.solve1(new int[]{5}, 5));
        assertEquals(1, p3.solve1(new int[]{5}, 5));
    }

    @Test
    public void test3() {
        assertEquals(6, p1.solve1(new int[]{1, 2, 3, 5}, 5));
        assertEquals(6, p2.solve1(new int[]{1, 2, 3, 5}, 5));
        assertEquals(6, p3.solve1(new int[]{1, 2, 3, 5}, 5));
    }
}
