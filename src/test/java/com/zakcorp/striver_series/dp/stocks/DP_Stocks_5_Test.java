package com.zakcorp.striver_series.dp.stocks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DP_Stocks_5_Test {
    DP_Stocks_5.Recursion p1 = new DP_Stocks_5.Recursion();
    DP_Stocks_5.Memoization p2 = new DP_Stocks_5.Memoization();
    DP_Stocks_5.Tabulation p3= new DP_Stocks_5.Tabulation();
    @Test
    public void test1() {
        assertEquals( 3, p1.solve1(new int[]{1, 3, 4, 0, 2}, 5, 1));
        assertEquals( 3, p2.solve1(new int[]{1, 3, 4, 0, 2}, 5, 1));
        assertEquals( 3, p3.solve1(new int[]{1, 3, 4, 0, 2}, 5, 1));
    }
    @Test
    public void test2() {
        assertEquals( 8, p1.solve1(new int[]{1, 3, 2, 8, 4, 9}, 6, 2));
        assertEquals( 8, p2.solve1(new int[]{1, 3, 2, 8, 4, 9}, 6, 2));
        assertEquals( 8, p3.solve1(new int[]{1, 3, 2, 8, 4, 9}, 6, 2));
    }
    @Test
    public void test3() {
        assertEquals( 1, p1.solve1(new int[]{10, 3, 7, 5, 1, 3}, 6, 3));
        assertEquals( 1, p2.solve1(new int[]{10, 3, 7, 5, 1, 3}, 6, 3));
        assertEquals( 1, p3.solve1(new int[]{10, 3, 7, 5, 1, 3}, 6, 3));
    }
}
