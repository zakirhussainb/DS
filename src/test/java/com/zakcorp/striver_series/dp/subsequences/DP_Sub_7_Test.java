package com.zakcorp.striver_series.dp.subsequences;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DP_Sub_7_Test {
    DP_Sub_7.Recursion p1 = new DP_Sub_7.Recursion();
    DP_Sub_7.Memoization p2 = new DP_Sub_7.Memoization();
    DP_Sub_7.Tabulation p3 = new DP_Sub_7.Tabulation();
    @Test
    public void test1() {
        assertEquals(3, p1.solve1(new int[]{1, 5}, 11));
        assertEquals(3, p2.solve1(new int[]{1, 5}, 11));
        assertEquals(3, p3.solve1(new int[]{1, 5}, 11));
    }
    @Test
    public void test2() {
        assertEquals(-1, p1.solve1(new int[]{2, 5}, 3));
        assertEquals(-1, p2.solve1(new int[]{2, 5}, 3));
        assertEquals(-1, p3.solve1(new int[]{2, 5}, 3));
    }
    @Test
    public void test3() {
        assertEquals(0, p1.solve1(new int[]{1}, 0));
        assertEquals(0, p2.solve1(new int[]{1}, 0));
        assertEquals(0, p3.solve1(new int[]{1}, 0));
    }
}
