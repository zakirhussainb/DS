package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_2587_Test {
    Problem_2587.Solver p = new Problem_2587.Solver();
    @Test
    public void test1() {
//        assertEquals(6, p.solve1(new int[]{2,-1,0,1,-3,3,-3}));
        assertEquals(6, p.solve2(new int[]{2,-1,0,1,-3,3,-3}));
    }
    @Test
    public void test2() {
//        assertEquals(0, p.solve1(new int[]{-2,-3,0}));
        assertEquals(0, p.solve2(new int[]{-2,-3,0}));
    }
    @Test
    public void test3() {
//        assertEquals(20, p.solve1(new int[]{-687767,-860350,950296,52109,510127,545329,-291223,-966728,
//                852403,828596,456730,-483632,-529386,356766,147293,572374,243605,931468,641668,494446}));
        assertEquals(20, p.solve2(new int[]{-687767,-860350,950296,52109,510127,545329,-291223,-966728,
                852403,828596,456730,-483632,-529386,356766,147293,572374,243605,931468,641668,494446}));
    }
}
