package com.zakcorp.striver_series.dp.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DP_Strings_3_Test {
    DP_Strings_3.Tabulation p1 = new DP_Strings_3.Tabulation();

    @Test
    public void test1() {
        assertEquals(4, p1.solve1("eeeme"));
    }

    @Test
    public void test2() {
        assertEquals(2, p1.solve1("annb"));
    }

    @Test
    public void test3() {
        assertEquals(1, p1.solve1("s"));
    }

    @Test
    public void test4() {
        assertEquals(7, p1.solve1("bbabcbcab"));
    }
}
