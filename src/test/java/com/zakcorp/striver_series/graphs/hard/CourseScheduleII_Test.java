package com.zakcorp.striver_series.graphs.hard;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class CourseScheduleII_Test {
    CourseScheduleII.Solver p1 = new CourseScheduleII.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{0, 1, 2, 3}, p1.findOrder(4, new int[][]{{1, 0}, {2, 1}, {3, 2}}));
    }
}
