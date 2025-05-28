package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1834 {
    static class Task {
        int taskID;
        int enqueueTime;
        int processingTime;
        public Task(int taskID, int enqueueTime, int processingTime) {
            this.taskID = taskID;
            this.enqueueTime = enqueueTime;
            this.processingTime = processingTime;
        }
    }
    static class Solver {
        public int[] solve1(int[][] tasks) {
            int n = tasks.length;
            Task[] sorted = new Task[n];
            for (int i = 0; i < n; i++) {
                sorted[i] = new Task(i, tasks[i][0], tasks[i][1]);
            }

            Arrays.sort(sorted, Comparator.comparingInt(task -> task.enqueueTime));

            PriorityQueue<Task> minHeap = new PriorityQueue<Task>((task1, task2) -> {
                if (task1.processingTime == task2.processingTime) {
                    return task1.taskID - task2.taskID;
                }
                return task1.processingTime - task2.processingTime;
            });

            int nextTaskIndex = 0;
            int[] order = new int[n];
            int orderIndex = 0;
            int currTime = 0;

            while (orderIndex < n) {
                // Add all the tasks that came in while previous was getting processed
                while (nextTaskIndex < sorted.length && sorted[nextTaskIndex].enqueueTime <= currTime) {
                    minHeap.add(sorted[nextTaskIndex]);
                    nextTaskIndex++;
                }

                // No tasks came in while previous was getting processed
                if (minHeap.isEmpty()) {
                    currTime = sorted[nextTaskIndex].enqueueTime;
                    continue;
                }

                Task minTask = minHeap.poll();
                order[orderIndex++] = minTask.taskID;
                currTime += minTask.processingTime;
            }
            return order;
        }
    }
}
