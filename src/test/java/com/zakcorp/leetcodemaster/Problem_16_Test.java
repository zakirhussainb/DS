package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Zakir Hussain B on 30/09/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Problem_16_Test {
    Problem_16.Solver p = new Problem_16.Solver();
    @Test
    public void test1() {
        assertEquals(1, p.solve1(new int[]{-2, 0, 1, 2}, 2));
        assertEquals(1, p.solve2(new int[]{-2, 0, 1, 2}, 2));
    }
    @Test
    public void test2() {
        assertEquals(0, p.solve1(new int[]{-3, -1, 1, 2}, 1));
        assertEquals(0, p.solve2(new int[]{-3, -1, 1, 2}, 1));
    }
    @Test
    public void test3() {
        assertEquals(3, p.solve1(new int[]{1, 0, 1, 1}, 100));
        assertEquals(3, p.solve2(new int[]{1, 0, 1, 1}, 100));
    }
    @Test
    public void test4() {
        assertEquals(2, p.solve1(new int[]{-1,2,1,-4}, 1));
        assertEquals(2, p.solve2(new int[]{-1,2,1,-4}, 1));
    }
}