package com.zakcorp.striver_series.dp.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class DP_Strings_1_Test {
    DP_Strings_1.Recursion p1 = new DP_Strings_1.Recursion();
    DP_Strings_1.Memoization p2 = new DP_Strings_1.Memoization();
    DP_Strings_1.Tabulation p3 = new DP_Strings_1.Tabulation();

    @Test
    public void test1() {
        assertEquals(3, p1.solve1("bdefg", "bfg"));
        assertEquals(3, p2.solve1("bdefg", "bfg"));
        assertEquals(3, p3.solve1("bdefg", "bfg"));
    }

    @Test
    public void test2() {
        assertEquals(2, p1.solve1("mnop", "mnq"));
        assertEquals(2, p2.solve1("mnop", "mnq"));
        assertEquals(2, p3.solve1("mnop", "mnq"));
    }

    @Test
    public void test3() {
        assertEquals(2, p1.solve1("abc", "dafb"));
        assertEquals(2, p2.solve1("abc", "dafb"));
        assertEquals(2, p3.solve1("abc", "dafb"));
    }
}
