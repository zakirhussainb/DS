package com.zakcorp.striver_series.dp.stocks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DP_Stocks_3_Test {
    DP_Stocks_3.Recursion p1 = new DP_Stocks_3.Recursion();
    DP_Stocks_3.Memoization p2 = new DP_Stocks_3.Memoization();
    @Test
    public void test1() {
//        assertEquals( 15, p1.solve1(new int[]{4, 2, 7, 1, 11, 5}, 6));
        assertEquals( 15, p2.solve1(new int[]{4, 2, 7, 1, 11, 5}, 6));
    }
}
