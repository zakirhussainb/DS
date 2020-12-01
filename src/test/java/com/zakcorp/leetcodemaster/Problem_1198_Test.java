package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1198_Test {
    Problem_1198.Solver p = new Problem_1198.Solver();
    @Test
    public void test1() {
        assertEquals(5, p.solve1(new int[][]{ {1,2,3,4,5},{2,4,5,8,10},
                {3,5,7,9,11},{1,3,5,7,9} }));
        assertEquals(5, p.solve2(new int[][]{ {1,2,3,4,5},{2,4,5,8,10},
                {3,5,7,9,11},{1,3,5,7,9} }));
    }
    @Test
    public void test2() {
        assertEquals(5, p.solve1(new int[][]{ {1,2,3,4,5,9},{2,4,5,8,9,10},
                {3,5,7,9,11,12},{1,3,5,7,9,10} }));
        assertEquals(5, p.solve2(new int[][]{ {1,2,3,4,5,9},{2,4,5,8,9,10},
                {3,5,7,9,11,12},{1,3,5,7,9,10} }));
    }
}
