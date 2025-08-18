package com.zakcorp.striver_series.dp.lis;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class DP_Lis_4_Test {
    DP_Lis_4.Tabulation p1 = new DP_Lis_4.Tabulation();

    @Test
    public void test1() {
        assertEquals(4, p1.solve1(new String[]{"dog", "dogs", "dots", "dot", "d", "do"}));
    }
}
