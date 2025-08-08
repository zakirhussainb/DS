package com.zakcorp.striver_series.dp.subsequences;

import org.junit.Test;

import static org.junit.Assert.*;

public class DP_Sub_3_Test {
    DP_Sub_3.Tabulation p1 = new DP_Sub_3.Tabulation();
    @Test
    public void test1() {
        assertEquals(1, p1.solve1(new int[]{1, 7, 14, 5}));
    }
    @Test
    public void test2() {
        assertEquals(0, p1.solve1(new int[]{3, 1, 6, 2, 2}));
    }
    @Test
    public void test3() {
        assertEquals(3, p1.solve1(new int[]{2, 2, 2, 9}));
    }
}
