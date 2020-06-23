package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_557_Test {
    Problem_557.Solver p = new Problem_557.Solver();
    Problem_557.Solver1 p1 = new Problem_557.Solver1();

    @Test
    public void test1() {
//        assertEquals("s'teL ekat edoCteeL tsetnoc", p.reverseWords("Let's take LeetCode contest"));
        assertEquals("s'teL ekat edoCteeL tsetnoc", p1.reverseWords("Let's take LeetCode contest"));
    }
}