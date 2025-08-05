package com.zakcorp.striver_series.dp.subsequences;

import org.junit.Test;
import static org.junit.Assert.*;

public class DP_Sub_1_Test {
    DP_Sub_1.Recursion p1 = new DP_Sub_1.Recursion();
    @Test
    public void test1() {
        assertTrue(p1.solve1(new int[]{1, 2, 7, 3}, 6));
    }
    @Test
    public void test2() {
        assertFalse(p1.solve1(new int[]{2, 3, 5}, 6));
    }
    @Test
    public void test3() {
        assertTrue(p1.solve1(new int[]{7, 54, 4, 12, 15, 5}, 9));
    }
}
