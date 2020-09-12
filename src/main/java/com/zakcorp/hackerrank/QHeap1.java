package com.zakcorp.hackerrank;

import java.io.*;
import java.util.*;

/**
 * Created by Zakir Hussain B on 13/09/20.
 *
 * @source: HackerRank
 * @topic: PriorityQueue
 * @sub-topic: PriorityQueue, Min-Heap
 * @platform: HackerRank
 * @problem_link: https://www.hackerrank.com/challenges/qheap1/
 * @pseudocode:
 */
public class QHeap1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while(q --> 0) {
            String str = br.readLine();
            processQuery(str, pq);
        }
    }
    private static void processQuery(String str, PriorityQueue<Integer> pq) {
        String[] input = str.split("\\s+");
        int type = Integer.parseInt(input[0]);
        switch(type) {
            case 1:
                pq.add(Integer.parseInt(input[1]));
                break;
            case 2:
                pq.remove(Integer.parseInt(input[1]));
                break;
            case 3:
                System.out.println(pq.peek());
                break;
        }
    }
}