package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1029_Test {
    Problem_1029.Solver p = new Problem_1029.Solver();
    @Test
    public void test1() {
        assertEquals(110, p.solve1( new int[][]{{10,20},{30,200},{400,50},{30,20}} ));
    }
    @Test
    public void test2() {
        assertEquals(1859, p.solve1( new int[][]{{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}} ));
    }
    @Test
    public void test3() {
        assertEquals(3086, p.solve1( new int[][]{{515,563},{451,713},{537,709},{343,819},{855,779},{457,60},{650,359},{631,42}} ));
    }
}
