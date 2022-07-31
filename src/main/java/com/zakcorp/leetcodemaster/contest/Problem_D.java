package com.zakcorp.leetcodemaster.contest;

import com.zakcorp.leetcodemaster.Problem_207;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Problem_D {
    static class Solver {
        static final int N = 100000;

        // variables to be used
        // in both functions
        @SuppressWarnings("unchecked")
        static Vector<Integer>[] graph = new Vector[N];
        @SuppressWarnings("unchecked")
        static Vector<Integer>[] cycles = new Vector[N];
        static int cyclenumber;

        public int longestCycle(int[] edges) {
            for (int i = 0; i < N; i++)
            {
                graph[i] = new Vector<>();
                cycles[i] = new Vector<>();
            }

            for(int i = 0; i < edges.length; i++) {
                if(edges[i] != -1) {
                    addEdge(i, edges[i]);
                }
            }
            // arrays required to color the
            // graph, store the parent of node
            int[] color = new int[N];
            int[] par = new int[N];

            // mark with unique numbers
            int[] mark = new int[N];

            // store the numbers of cycle
            cyclenumber = 0;

            // call DFS to mark the cycles
            dfs_cycle(1, 0, color, mark, par);

            // function to print the cycles
            return printCycles(edges.length, mark);
        }

        static void dfs_cycle(int u, int p, int[] color,
                              int[] mark, int[] par)
        {

            // already (completely) visited vertex.
            if (color[u] == 2)
            {
                return;
            }

            // seen vertex, but was not completely visited -> cycle detected.
            // backtrack based on parents to find the complete cycle.
            if (color[u] == 1)
            {

                cyclenumber++;
                int cur = p;
                mark[cur] = cyclenumber;

                // backtrack the vertex which are
                // in the current cycle thats found
                while (cur != u)
                {
                    cur = par[cur];
                    mark[cur] = cyclenumber;
                }
                return;
            }
            par[u] = p;

            // partially visited.
            color[u] = 1;

            // simple dfs on graph
            for (int v : graph[u])
            {

                // if it has not been visited previously
                if (v == par[u])
                {
                    continue;
                }
                dfs_cycle(v, u, color, mark, par);
            }

            // completely visited.
            color[u] = 2;
        }
        static void addEdge(int u, int v)
        {
            graph[u].add(v);
        }
        // Function to print the cycles
        static int printCycles(int edges, int mark[])
        {

            // push the edges that into the
            // cycle adjacency list
            for (int i = 1; i <= edges; i++)
            {
                if (mark[i] != 0)
                    cycles[mark[i]].add(i);
            }

            // print all the vertex with same cycle
            int maxSize = Integer.MIN_VALUE;
            for (int i = 1; i <= cyclenumber; i++)
            {
                // Print the i-th cycle
                System.out.printf("Cycle Number %d: ", i);
                maxSize = Math.max(maxSize, cycles[i].size());
                for (int x : cycles[i])
                    System.out.printf("%d ", x);
                System.out.println();
            }
            System.out.println("maxSize   " + maxSize);
            return maxSize < 0 ? -1 : maxSize;
        }
    }
}
