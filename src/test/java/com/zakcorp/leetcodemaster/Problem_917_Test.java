package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_917_Test {
    Problem_917.Solver p = new Problem_917.Solver();
    Problem_917.Solver1 p1 = new Problem_917.Solver1();
    @Test
    public void test1() {
        assertEquals("dc-ba", p.reverseOnlyLetters("ab-cd"));
        assertEquals("dc-ba", p1.reverseOnlyLetters("ab-cd"));
    }
    @Test
    public void test2() {
        assertEquals("j-Ih-gfE-dCba", p.reverseOnlyLetters("a-bC-dEf-ghIj"));
        assertEquals("j-Ih-gfE-dCba", p1.reverseOnlyLetters("a-bC-dEf-ghIj"));
    }
    @Test
    public void test3() {
        assertEquals("Qedo1ct-eeLg=ntse-T!", p.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
        assertEquals("Qedo1ct-eeLg=ntse-T!", p1.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }
}
