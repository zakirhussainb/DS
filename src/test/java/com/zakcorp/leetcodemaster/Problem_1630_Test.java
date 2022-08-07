package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Problem_1630_Test {
    Problem_1630.Solver p = new Problem_1630.Solver();
    @Test
    public void test1() {
        assertEquals(Arrays.asList(true,false,true), p.solve1(new int[]{4,6,5,9,3,7},
                new int[]{0,0,2}, new int[]{2,3,5}));
    }
    @Test
    public void test2() {
        assertEquals(Arrays.asList(false,true,false,false,true,true), p.solve1(new int[]{-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10},
                new int[]{0,1,6,4,8,7}, new int[]{4,4,9,7,9,10}));
    }
}
