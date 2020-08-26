package com.zakcorp.graphs.algorithms;

import org.junit.Test;

public class KruskalsAlgorithm_Test {
    @Test
    public void testKruskalsMST() {
        KruskalsAlgorithm.EfficientImpl.Graph g = new KruskalsAlgorithm.EfficientImpl.Graph(4);
        g.addEdge(0, 1, 10);
        g.addEdge(0, 2, 6);
        g.addEdge(0, 3, 5);
        g.addEdge(1, 3, 15);
        g.addEdge(2, 3, 4);
        KruskalsAlgorithm.EfficientImpl krsl = new KruskalsAlgorithm.EfficientImpl(g);
        for( KruskalsAlgorithm.EfficientImpl.Graph.Edge edge : krsl.kruskalsMST() ) {
            System.out.println(edge.u + "->" + edge.v + "=" + edge.weight);
        }
        System.out.println();
    }
}
