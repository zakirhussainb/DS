package com.zakcorp.striver_series.dp.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DP_Strings_7_Test {
    DP_Strings_7.Recursion p1 = new DP_Strings_7.Recursion();
    DP_Strings_7.Memoization p2 = new DP_Strings_7.Memoization();
    DP_Strings_7.Tabulation p3 = new DP_Strings_7.Tabulation();
//    DP_Strings_7.SpaceOptimization p4 = new DP_Strings_7.SpaceOptimization();

    @Test
    public void test1() {
        assertEquals(2, p1.solve1("axbxax", "axa"));
        assertEquals(2, p2.solve1("axbxax", "axa"));
        assertEquals(2, p3.solve1("axbxax", "axa"));
//        assertEquals(2, p4.solve1("axbxax", "axa"));
    }
    @Test
    public void test2() {
        assertEquals(5, p1.solve1("babgbag", "bag"));
        assertEquals(5, p2.solve1("babgbag", "bag"));
        assertEquals(5, p3.solve1("babgbag", "bag"));
//        assertEquals(5, p4.solve1("babgbag", "bag"));
    }
    @Test
    public void test3() {
        assertEquals(1, p1.solve1("abcde", "ace"));
        assertEquals(1, p2.solve1("abcde", "ace"));
        assertEquals(1, p3.solve1("abcde", "ace"));
//        assertEquals(1, p4.solve1("abcde", "ace"));
    }
}
