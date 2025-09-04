package com.zakcorp.striver_series.dp.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DP_Strings_6_Test {
    DP_Strings_6.Tabulation p1 = new DP_Strings_6.Tabulation();

    @Test
    public void test1() {
        assertEquals("mnop", p1.solve1("mno", "nop"));
    }

    @Test
    public void test2() {
        assertEquals("dynprogramic", p1.solve1("dynamic", "program"));
    }

    @Test
    public void test3() {
        assertEquals("orapplnge", p1.solve1("apple", "orange"));
    }
}
