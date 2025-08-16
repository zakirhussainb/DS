package com.zakcorp.striver_series.dp.lis;

import org.junit.Test;

import static org.junit.Assert.*;

public class DP_Lis_1_Test {
    DP_Lis_1.Recursion p1 = new DP_Lis_1.Recursion();
    DP_Lis_1.Memoization p2 = new DP_Lis_1.Memoization();
    DP_Lis_1.LIS_BinarySearch p3 = new DP_Lis_1.LIS_BinarySearch();
    DP_Lis_1.Tabulation p4 = new DP_Lis_1.Tabulation();

    @Test
    public void test1() {
        assertEquals(4, p1.solve1(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        assertEquals(4, p2.solve1(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        assertEquals(4, p3.solve1(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        assertEquals(4, p4.solve1(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }

    @Test
    public void test2() {
        assertEquals(4, p1.solve1(new int[]{0, 1, 0, 3, 2, 3}));
        assertEquals(4, p2.solve1(new int[]{0, 1, 0, 3, 2, 3}));
        assertEquals(4, p3.solve1(new int[]{0, 1, 0, 3, 2, 3}));
    }

    @Test
    public void test3() {
        assertEquals(1, p1.solve1(new int[]{7, 7, 7, 7, 7, 7, 7}));
        assertEquals(1, p2.solve1(new int[]{7, 7, 7, 7, 7, 7, 7}));
        assertEquals(1, p3.solve1(new int[]{7, 7, 7, 7, 7, 7, 7}));
    }
}
