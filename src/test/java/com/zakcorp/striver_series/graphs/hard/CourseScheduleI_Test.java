package com.zakcorp.striver_series.graphs.hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class CourseScheduleI_Test {
    CourseScheduleI.Solver p1 = new CourseScheduleI.Solver();
    @Test
    public void test1() {
        assertTrue(p1.canFinish(4, new int[][]{{1, 0}, {2, 1}, {3, 2}}));
    }
}
