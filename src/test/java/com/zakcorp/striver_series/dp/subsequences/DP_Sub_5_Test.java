package com.zakcorp.striver_series.dp.subsequences;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DP_Sub_5_Test {
    DP_Sub_5.Recursion p1 = new DP_Sub_5.Recursion();
    DP_Sub_5.Memoization p2 = new DP_Sub_5.Memoization();
    @Test
    public void test1() {
        assertEquals(3, p1.solve1(new int[]{1, 1, 2, 3}, 1));
        assertEquals(3, p2.solve1(new int[]{1, 1, 2, 3}, 1));
    }
    @Test
    public void test2() {
        assertEquals(2, p1.solve1(new int[]{1, 2, 3, 4}, 2));
        assertEquals(2, p2.solve1(new int[]{1, 2, 3, 4}, 2));
    }
    @Test
    public void test3() {
        assertEquals(1, p1.solve1(new int[]{5, 2, 6, 4}, 3));
        assertEquals(1, p2.solve1(new int[]{5, 2, 6, 4}, 3));
    }
    @Test
    public void test4() {
        assertEquals(0, p1.solve1(new int[]{7,9,13,4,14,2,20,14,5,15,4}, 90));
        assertEquals(0, p2.solve1(new int[]{7,9,13,4,14,2,20,14,5,15,4}, 90));
    }
}
