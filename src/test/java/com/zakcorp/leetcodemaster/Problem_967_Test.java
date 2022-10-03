package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class Problem_967_Test {
    Problem_967.Solver p = new Problem_967.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{181,292,707,818,929}, p.solve1(3, 7));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{11,22,33,44,55,66,77,88,99}, p.solve1(2, 0));
    }
}
