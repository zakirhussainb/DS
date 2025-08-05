package com.zakcorp.striver_series.dp.twodimensional;

import org.junit.Test;

import static org.junit.Assert.*;

public class DP_Ninja_Training_Test {
    DP_Ninja_Training.Recursion p1 = new DP_Ninja_Training.Recursion();
    DP_Ninja_Training.Memoization p2 = new DP_Ninja_Training.Memoization();
    @Test
    public void test1() {
        assertEquals(210, p1.solve1(new int[][]{{10, 40, 70}, {20, 50, 80}, {30, 60, 90}}));
        assertEquals(210, p2.solve1(new int[][]{{10, 40, 70}, {20, 50, 80}, {30, 60, 90}}));
    }
}
