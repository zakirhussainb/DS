package com.zakcorp.graphs.algorithms;

import org.junit.Test;
import java.util.Comparator;

public class KruskalsAlgorithm_Test {
    @Test
    public void testKruskalsMST_NaiveImpl() {
        KruskalsAlgorithm.Graph g = new KruskalsAlgorithm.Graph(4);
        g.addEdge(0, 1, 10);
        g.addEdge(0, 2, 6);
        g.addEdge(0, 3, 5);
        g.addEdge(1, 3, 15);
        g.addEdge(2, 3, 4);
        g.edgeList.sort(Comparator.comparingInt(e -> e.weight));
        KruskalsAlgorithm.NaiveImpl krslNaive = new KruskalsAlgorithm.NaiveImpl(g);
        for( KruskalsAlgorithm.Graph.Edge edge : krslNaive.kruskalsMST() ) {
            System.out.println(edge.u + "->" + edge.v + "=" + edge.weight);
        }
        System.out.println();
    }
    @Test
    public void testKruskalsMST_EfficientImpl() {
        KruskalsAlgorithm.Graph g = new KruskalsAlgorithm.Graph(4);
        g.addEdge(0, 1, 10);
        g.addEdge(0, 2, 6);
        g.addEdge(0, 3, 5);
        g.addEdge(1, 3, 15);
        g.addEdge(2, 3, 4);
        g.edgeList.sort(Comparator.comparingInt(e -> e.weight));
        KruskalsAlgorithm.EfficientImpl krslEff = new KruskalsAlgorithm.EfficientImpl(g);
        for( KruskalsAlgorithm.Graph.Edge edge : krslEff.kruskalsMST() ) {
            System.out.println(edge.u + "->" + edge.v + "=" + edge.weight);
        }
        System.out.println();
    }
}
