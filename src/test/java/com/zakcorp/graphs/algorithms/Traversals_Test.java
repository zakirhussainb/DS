package com.zakcorp.graphs.algorithms;

import org.junit.Test;

public class Traversals_Test {

    @Test
    public void testDFS() {
        DepthFirstSearch.Graph g = new DepthFirstSearch.Graph(5);
        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 4);
        DepthFirstSearch dfs = new DepthFirstSearch(g);
        dfs.dfs(0);
        System.out.println();
        dfs.dfsIter(0);
    }
}
