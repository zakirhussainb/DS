package com.zakcorp.leetcodemaster;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Problem_295 {
    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;
    public Problem_295() {
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        minHeap.add(num);
        maxHeap.offer(minHeap.poll());

        if (minHeap.size() < maxHeap.size())
            minHeap.offer(maxHeap.poll());
    }

    public double findMedian() {
        if (minHeap.size() > maxHeap.size())
            return minHeap.peek();
        else
            return (minHeap.peek() + maxHeap.peek()) / 2.0;
    }
}
