package com.zakcorp.graphs.algorithms;

import org.junit.Test;

public class ToplogicalSort_Test {
    @Test
    public void testTopologicalSort() {
        TopologicalSort.Graph g = new TopologicalSort.Graph(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        TopologicalSort tps = new TopologicalSort(g);
        for( Integer v : tps.topologicalSort() ) {
            System.out.print(v + "->");
        }
        System.out.println();
    }
}
