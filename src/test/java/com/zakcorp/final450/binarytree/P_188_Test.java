package com.zakcorp.final450.binarytree;

import org.junit.Test;

import static org.junit.Assert.*;

public class P_188_Test {
    P_188.Solver p = new P_188.Solver();

    // If the given graph is a Tree, return true.
    @Test
    public void test1() {
        P_188.Graph g = new P_188.Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(3, 4);

        assertTrue( p.solve1(g) );
    }
    // If the given graph is not a Tree, return false.
    @Test
    public void test2() {
        P_188.Graph g = new P_188.Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(3, 4);

        assertFalse( p.solve1(g) );
    }
}
