package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        System.out.println(p.solve1(new int[][]{{1,1},{4,5},{3,8}},
                new int[][]{{1,5},{3,1}}));
    }
}
