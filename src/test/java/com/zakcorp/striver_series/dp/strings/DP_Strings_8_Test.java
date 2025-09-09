package com.zakcorp.striver_series.dp.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DP_Strings_8_Test {
    DP_Strings_8.Recursion p1 = new DP_Strings_8.Recursion();
    DP_Strings_8.Memoization p2 = new DP_Strings_8.Memoization();

    @Test
    public void test1() {
        assertEquals(2, p1.solve1("planet", "plan"));
        assertEquals(2, p2.solve1("planet", "plan"));
    }

    @Test
    public void test2() {
        assertEquals(4, p1.solve1("abcdefg", "azced"));
        assertEquals(4, p2.solve1("abcdefg", "azced"));
    }

    @Test
    public void test3() {
        assertEquals(3, p1.solve1("saturday", "sunday"));
        assertEquals(3, p2.solve1("saturday", "sunday"));
    }
}
