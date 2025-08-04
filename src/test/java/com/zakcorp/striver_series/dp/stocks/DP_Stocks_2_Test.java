package com.zakcorp.striver_series.dp.stocks;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DP_Stocks_2_Test {
    DP_Stocks_2.Recursion p1 = new DP_Stocks_2.Recursion();
    DP_Stocks_2.Memoization p2 = new DP_Stocks_2.Memoization();
    @Test
    public void test1() {
        assertEquals( 7, p1.solve1(new int[]{9, 2, 6, 4, 7, 3}, 6));
        assertEquals( 7, p2.solve1(new int[]{9, 2, 6, 4, 7, 3}, 6));
    }
    @Test
    public void test2() {
        assertEquals( 7, p1.solve1(new int[]{9, 2, 6, 4, 7, 3}, 6));
        assertEquals( 4, p2.solve1(new int[]{2, 3, 4, 5, 6}, 5));
    }
    @Test
    public void test3() {
        assertEquals( 0, p1.solve1(new int[]{8, 6, 5, 4, 3}, 5));
        assertEquals( 0, p2.solve1(new int[]{8, 6, 5, 4, 3}, 5));
    }
}
