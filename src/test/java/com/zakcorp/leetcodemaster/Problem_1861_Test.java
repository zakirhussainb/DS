package com.zakcorp.leetcodemaster;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Problem_1861_Test
{
    Problem_1861.Solver p = new Problem_1861.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new char[][]{{'.'},{'#'},{'#'}}, p.solve1(new char[][]{{'#','.','#'}}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new char[][] { { '#', '.' },
                                         { '#', '#' },
                                         { '*', '*' },
                                         { '.', '.' }}, p.solve1(new char[][]{{'#','.','*','.'}, {'#','#','*','.'}}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new char[][] { {'.','#','#'},
                                         {'.','#','#'},
                                         {'#','#','*'},
                                         {'#','*','.'},
                                         {'#','.','*'},
                                         {'#','.','.'} }, p.solve1(new char[][]{ {'#','#','*','.','*','.'},
                                                                              {'#','#','#','*','.','.'},
                                                                              {'#','#','#','.','#','.'}} ));
    }

    @Test
    public void test4() {
        assertArrayEquals(new char[][] { {'*'},{'#'},{'*'},{'.'},{'.'},{'.'},{'.'},{'#'},{'*'},{'.'} }, p.solve1(new char[][]{ {'*','#','*','.','.','.','#','.','*','.'} } ));
    }
}
