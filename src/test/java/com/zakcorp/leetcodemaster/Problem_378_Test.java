package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_378_Test {
    Problem_378.Solver p = new Problem_378.Solver();
    @Test
    public void test1() {
        assertEquals(13, p.solve1(new int[][]{{1,5,9},{10,11,13},{12,13,15}}, 8));
    }
}
