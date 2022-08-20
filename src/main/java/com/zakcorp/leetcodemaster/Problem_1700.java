package com.zakcorp.leetcodemaster;

import java.util.LinkedList;
import java.util.Queue;

public class Problem_1700 {
    static class Solver {
        public int solve1(int[] students, int[] sandwiches) {
            Queue<Integer> stuQueue = new LinkedList<>();
            Queue<Integer> sandQueue = new LinkedList<>();
            for(int stu : students)
                stuQueue.add(stu);

            for(int sand : sandwiches)
                sandQueue.add(sand);

            int count = 0;
            while(!stuQueue.isEmpty() && !sandQueue.isEmpty()) {
                int stu = stuQueue.poll();
                int sand = sandQueue.peek();
                if(stu == sand) {
                    sandQueue.poll();
                    count = 0;
                } else {
                    stuQueue.add(stu);
                    count++;
                    if(count > stuQueue.size())
                        break;
                }
            }
            return stuQueue.size();
        }
    }
}
