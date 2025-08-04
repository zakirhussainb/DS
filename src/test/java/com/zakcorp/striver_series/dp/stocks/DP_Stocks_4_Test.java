package com.zakcorp.striver_series.dp.stocks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DP_Stocks_4_Test {
    DP_Stocks_4.Recursion p1 = new DP_Stocks_4.Recursion();
    DP_Stocks_4.Memoization p2 = new DP_Stocks_4.Memoization();
    @Test
    public void test1() {
        assertEquals( 7, p1.solve1(new int[]{3, 2, 6, 5, 0, 3}, 6, 2));
        assertEquals( 7, p2.solve1(new int[]{3, 2, 6, 5, 0, 3}, 6, 2));
    }
}
