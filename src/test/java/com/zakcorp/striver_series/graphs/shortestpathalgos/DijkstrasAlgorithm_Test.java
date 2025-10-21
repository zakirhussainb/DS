package com.zakcorp.striver_series.graphs.shortestpathalgos;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertArrayEquals;

public class DijkstrasAlgorithm_Test {

    DijkstrasAlgorithm.Solver s1 = new DijkstrasAlgorithm.Solver();
    @Test
    public void test1() {
        // Create adjacency list
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();

        ArrayList<ArrayList<Integer>> node0 = new ArrayList<>();
        node0.add(new ArrayList<>(Arrays.asList(1, 1)));
        node0.add(new ArrayList<>(Arrays.asList(2, 6)));
        adj.add(node0);

        ArrayList<ArrayList<Integer>> node1 = new ArrayList<>();
        node1.add(new ArrayList<>(Arrays.asList(2, 3)));
        node1.add(new ArrayList<>(Arrays.asList(0, 1)));
        adj.add(node1);

        ArrayList<ArrayList<Integer>> node2 = new ArrayList<>();
        node2.add(new ArrayList<>(Arrays.asList(1, 3)));
        node2.add(new ArrayList<>(Arrays.asList(0, 6)));
        adj.add(node2);

        assertArrayEquals(new int[]{4, 3, 0}, s1.dijkstra(3, adj, 2));
    }
}
