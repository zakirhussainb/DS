package com.zakcorp.graphs.problems;

import java.util.*;

/**
 * Created by Zakir Hussain B on 17/08/20.
 *
 * @source: HackerEarth General
 * @topic: Graph
 * @sub-topic: DFS
 * @platform: HackerEarth
 * @problem_link: https://www.hackerearth.com/practice/algorithms/graphs/graph-representation/practice-problems/algorithm/so-np-c559f406/description/
 */
public class SampleTest {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> all = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        all.add(list);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(2);
        all.add(list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(0);
        list2.add(3);
        all.add(list2);
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(2);
        list3.add(4);
        all.add(list3);
        System.out.println(bfs(all, 5));
    }
    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> g, int N) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[N + 1];
        int s = g.get(0).get(0);
        visited[s] = true;
        queue.add(s);
        while( !queue.isEmpty() ) {
            s = queue.poll();
            list.add(s);
            for(int i : g.get(s)) {
                if( !visited[i] ) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
        return list;
    }

}