package com.zakcorp.leetcodemaster;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class Problem_2001_Test
{
    Problem_2001.Solver p = new Problem_2001.Solver();
    Problem_2001.Solver1 p1 = new Problem_2001.Solver1();
    @Test
    public void test1() {
        assertEquals( 6, p.solve1( new int[][]{{4,8},{3,6},{10,20},{15,30}} ) );
        assertEquals( 6, p1.solve1( new int[][]{{4,8},{3,6},{10,20},{15,30}} ) );
        assertEquals( 6, p.solve2( new int[][]{{4,8},{3,6},{10,20},{15,30}} ) );

    }
}
