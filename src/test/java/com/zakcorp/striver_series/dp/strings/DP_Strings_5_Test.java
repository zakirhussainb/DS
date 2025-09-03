package com.zakcorp.striver_series.dp.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DP_Strings_5_Test {
    DP_Strings_5.Tabulation p1 = new DP_Strings_5.Tabulation();

    @Test
    public void test1() {
        assertEquals(5, p1.solve1("kitten", "sitting"));
    }
    @Test
    public void test2() {
        assertEquals(2, p1.solve1("flaw", "lawn"));
    }
    @Test
    public void test3() {
        assertEquals(12, p1.solve1("abcdef", "ghijkl"));
    }
}
