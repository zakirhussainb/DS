package com.zakcorp.revision;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TestMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int t = Integer.parseInt(line[1]);
        int[][] task = new int[n][2];
        for(int i_task = 0; i_task < n; i_task++)
        {
            String[] arr_task = br.readLine().split(" ");
            for(int j_task = 0; j_task < arr_task.length; j_task++)
            {
                task[i_task][j_task] = Integer.parseInt(arr_task[j_task]);
            }
        }

        int out_ = solve(n, t, task);
        System.out.println(out_);

        wr.close();
        br.close();
    }
    static int solve(int n, int t, int[][] task) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        Arrays.sort(task, Comparator.comparingInt(o -> o[0]));
        int maxHeapSum = 0;
        int maxVal = 0;
        for(int i = 0; i < n; i++) {
            int totalTime = t;
            int distance = 2 * task[i][0];
            int remainingTime = totalTime - distance;
            int currEffort = task[i][1];
            if(remainingTime < 0) {
                break;
            }
            while(maxHeapSum > remainingTime) {
                maxHeapSum -= maxHeap.poll();
            }
            if(maxHeap.isEmpty() && remainingTime > currEffort) {
                maxHeap.add(currEffort);
                maxHeapSum += currEffort;
            } else if(maxHeapSum + currEffort <= remainingTime) {
                maxHeap.add(currEffort);
                maxHeapSum += currEffort;
            } else {
                Integer currMax = maxHeap.peek();
                if(currMax != null && currMax > currEffort) {
                    maxHeap.poll();
                    maxHeap.add(currEffort);
                    maxHeapSum = maxHeapSum - currMax + currEffort;
                }
            }
            maxVal = Math.max(maxVal, maxHeap.size());
        }
        return maxVal;
    }
}
