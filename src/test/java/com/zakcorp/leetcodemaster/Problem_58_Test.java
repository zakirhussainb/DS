package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_58_Test {
    Problem_58.Solver p = new Problem_58.Solver();
    Problem_58.Solver1 p1 = new Problem_58.Solver1();
    @Test
    public void test1() {
        assertEquals(5, p.lengthOfLastWord("Hello World"));
        assertEquals(5, p1.lengthOfLastWord("Hello"));
    }
    @Test
    public void test2() {
        assertEquals(0, p.lengthOfLastWord(" "));
        assertEquals(0, p1.lengthOfLastWord(" "));
    }
    @Test
    public void test3() {
        assertEquals(0, p.lengthOfLastWord("        "));
        assertEquals(0, p1.lengthOfLastWord("        "));
    }
    @Test
    public void test4() {
        assertEquals(0, p.lengthOfLastWord("                       "));
        assertEquals(0, p1.lengthOfLastWord("                       "));
    }
    @Test
    public void test5() {
        assertEquals(0, p.lengthOfLastWord("                       "));
        assertEquals(1, p1.lengthOfLastWord("b   a    "));
    }
    @Test
    public void test6() {
        assertEquals(0, p.lengthOfLastWord("                       "));
        assertEquals(1, p1.lengthOfLastWord("    b   a    "));
    }

}
