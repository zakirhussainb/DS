package com.zakcorp.striver_series.dp.lis;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class DP_Lis_3_Test {
    DP_Lis_3.Tabulation p1 = new DP_Lis_3.Tabulation();

    @Test
    public void test1() {
        assertEquals(Arrays.asList(1, 4, 8, 16), p1.solve1(new int[]{1, 7, 4, 16, 8}));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList(5, 10, 20), p1.solve1(new int[]{3, 5, 10, 20}));
    }
}
