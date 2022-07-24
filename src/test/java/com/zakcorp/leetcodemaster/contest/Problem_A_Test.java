package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertEquals('c',
                p.solve1("abccbaacz") );
    }
    @Test
    public void test2() {
        assertEquals('d',
                p.solve1("abcdd") );
    }
}
