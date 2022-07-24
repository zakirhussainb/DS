package com.zakcorp.leetcodemaster.contest;

import com.zakcorp.leetcodemaster.classes.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_B_Test {
    Problem_B.Solver p = new Problem_B.Solver();
    @Test
    public void test1() {
        assertEquals(1,
                p.solve1(new int[][]{{3,2,1},{1,7,6},{2,7,7}}));
    }
    @Test
    public void test2() {
        assertEquals(3,
                p.solve1(new int[][]{{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}}));
    }
    @Test
    public void test3() {
        assertEquals(4,
                p.solve1(new int[][]{{13,13},{13,13}}));
    }
}
