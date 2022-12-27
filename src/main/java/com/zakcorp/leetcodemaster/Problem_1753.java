package com.zakcorp.leetcodemaster;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Problem_1753
{
    static class Solver1 {
        public int solve1(int a, int b, int c) {
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>( Comparator.reverseOrder() );
            maxHeap.add( a );maxHeap.add( b );maxHeap.add( c );
            int points = 0;
            while(!maxHeap.isEmpty()) {
                int num1 = maxHeap.poll();
                int num2 = 0;
                if(!maxHeap.isEmpty())
                    num2 = maxHeap.poll();
                num1 -= 1;
                num2 -= 1;
                if(num1 > 0)
                    maxHeap.add(num1);
                if(num2 > 0)
                    maxHeap.add(num2);
                points++;
                if(maxHeap.size() == 1)
                    break;
            }
            return points;
        }
    }
}
