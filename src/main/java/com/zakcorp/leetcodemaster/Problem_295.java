package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_295 {
    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;
    public Problem_295() {
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if(maxHeap.isEmpty() || maxHeap.peek() > num) {
            maxHeap.add(num);
        } else {
            minHeap.add(num);
        }
        if(maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.poll());
        } else if(minHeap.size() > maxHeap.size() + 1) {
            maxHeap.add(minHeap.poll());
        }
    }

    public double findMedian() {
        if (minHeap.size() < maxHeap.size())
            return maxHeap.peek();
        else if (minHeap.size() > maxHeap.size())
            return minHeap.peek();
        else
            return (minHeap.peek() + maxHeap.peek()) * 0.5;
    }
}
