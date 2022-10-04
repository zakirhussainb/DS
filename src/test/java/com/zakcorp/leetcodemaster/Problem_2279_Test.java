package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_2279_Test {
    Problem_2279.Solver p = new Problem_2279.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.solve1(new int[]{2,3,4,5}, new int[]{1,2,4,4}, 2));
    }
    @Test
    public void test2() {
        assertEquals(3, p.solve1(new int[]{10,2,2}, new int[]{2,2,0}, 100));
    }
    @Test
    public void test3() {
        assertEquals(13, p.solve1(new int[]{54,18,91,49,51,45,58,54,47,91,90,20,85,20,90,49,10,84,59,29,40,9,100,1,64,71,30,46,91},
                new int[]{14,13,16,44,8,20,51,15,46,76,51,20,77,13,14,35,6,34,34,13,3,8,1,1,61,5,2,15,18},
                77));
    }
}
