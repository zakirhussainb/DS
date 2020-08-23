package com.zakcorp.gfgmaster;

import com.zakcorp.graphs.problems.ConnectedComp;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConnectedComp_Test {
    ConnectedComp.Solver cc = new ConnectedComp.Solver();
    @Test
    public void test1() {
        int vertices = 8;
        Graph g = new Graph(vertices + 1);// plus 1 for array index.
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(6, 7);
        assertEquals(3, cc.solve1(g));

    }
}
