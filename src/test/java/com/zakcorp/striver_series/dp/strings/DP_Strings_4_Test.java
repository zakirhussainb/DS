package com.zakcorp.striver_series.dp.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DP_Strings_4_Test {
    DP_Strings_4.Tabulation p1 = new DP_Strings_4.Tabulation();

    @Test
    public void test1() {
        assertEquals(2, p1.solve1("abcaa"));
    }

    @Test
    public void test2() {
        assertEquals(1, p1.solve1("ba"));
    }

    @Test
    public void test3() {
        assertEquals(0, p1.solve1("madam"));
    }
}
