package com.zakcorp.striver_series.dp.lis;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DP_Lis_6_Test {
    DP_Lis_6.Tabulation p1 = new DP_Lis_6.Tabulation();

    @Test
    public void test1() {
        assertEquals(2, p1.solve1(new int[]{1, 3, 5, 4, 7}));
    }
}
