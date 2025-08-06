package com.zakcorp.striver_series.dp.subsequences;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DP_Sub_2_Test {
    DP_Sub_2.Recursion p1 = new DP_Sub_2.Recursion();
    DP_Sub_2.Memoization p2 = new DP_Sub_2.Memoization();
    @Test
    public void test1() {
//        assertTrue(p1.solve1(new int[]{1, 10, 21, 10}));
        assertTrue(p2.solve1(new int[]{1, 10, 21, 10}));
    }
}
