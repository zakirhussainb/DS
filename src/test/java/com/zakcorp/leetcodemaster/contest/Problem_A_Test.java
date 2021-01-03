package com.zakcorp.leetcodemaster.contest;

import com.zakcorp.leetcodemaster.Problem_1;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertEquals(91, p.solve1(new int[][]{{5,10},{2,5},{4,7},{3,9}}, 10));
    }
    @Test
    public void test2() {
        assertEquals(8, p.solve1(new int[][]{{1,3},{2,2},{3,1}}, 4));
    }
}
