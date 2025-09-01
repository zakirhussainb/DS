package com.zakcorp.striver_series.dp.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DP_Strings_2_Test {
    DP_Strings_2.Tabulation p1 = new DP_Strings_2.Tabulation();
    DP_Strings_2.SpaceOptimization p2 = new DP_Strings_2.SpaceOptimization();

    @Test
    public void test1() {
        assertEquals(2, p1.solve1("abcde", "abfce"));
        assertEquals(2, p2.solve1("abcde", "abfce"));
    }

    @Test
    public void test2() {
        assertEquals(4, p1.solve1("abcdxyz", "xyzabcd"));
        assertEquals(4, p2.solve1("abcdxyz", "xyzabcd"));
    }

    @Test
    public void test3() {
        assertEquals(0, p1.solve1("abcdef", "ghijkl"));
        assertEquals(0, p2.solve1("abcdef", "ghijkl"));
    }
}
