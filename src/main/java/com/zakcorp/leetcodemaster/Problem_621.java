package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_621 {
    static class Solver {
        public int solve1(char[] tasks, int n) {
            int[] map = new int[26];
            for(char c : tasks) {
                map[c - 'A']++;
            }
            Arrays.sort(map);
            int time = 0;
            while (map[25] > 0) {
                int i = 0;
                while (i <= n) {
                    if (map[25] == 0)
                        break;
                    if (i < 26 && map[25 - i] > 0)
                        map[25 - i]--;
                    time++;
                    i++;
                }
                Arrays.sort(map);
            }
            return time;
        }
        public int solve2(char[] tasks, int n) {
            int[] frequencies = new int[26];
            for (char task : tasks) {
                frequencies[task - 'A']++;
            }
            Arrays.sort(frequencies);
            int fMax = frequencies[25];
            int idleTime = (fMax - 1) * n;
            for (int i = frequencies.length - 2; i >= 0 && idleTime > 0; i--) {
                idleTime = idleTime - Math.min(fMax - 1, frequencies[i]);
            }
            idleTime = Math.max(0, idleTime);
            return idleTime + tasks.length;
        }
        // https://leetcode.com/problems/task-scheduler/discuss/104501/Java-PriorityQueue-solution-Similar-problem-Rearrange-string-K-distance-apart
        public int solve3(char[] tasks, int n) {
            if (tasks == null || tasks.length == 0)
                return -1;
            if(n == 0)
                return tasks.length;
            // Build a character frequency map
            Map<Character, Integer> charFreqMap = new HashMap<>();
            for(char ch : tasks) {
                charFreqMap.put(ch, charFreqMap.getOrDefault(ch, 0) + 1);
            }

            // Build a PriorityQueue with descending order of Map Entries.
            PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>( (a, b) -> b.getValue() - a.getValue() );
            pq.addAll(charFreqMap.entrySet());

            int count = 0;
            // When Queue is not empty, there are remaining tasks
            while(!pq.isEmpty()) {
                // For each interval
                int interval = n + 1; // Since the interval is 2, the actual task we can execute, is the one we're executing right now, plus the two in the interval. Therefore, it is n+1
                List<Map.Entry<Character, Integer>> entryList = new ArrayList<>();

                // Fill the intervals with the next high frequency task
                while(interval > 0 && !pq.isEmpty()) {
                    Map.Entry<Character, Integer> entry = pq.poll();
                    entry.setValue( entry.getValue() - 1 ); // decrease frequency, meaning it got executed
                    entryList.add(entry); // collect task to add back to queue
                    interval--;
                    count++; // successfully executed task
                }

                for(Map.Entry<Character, Integer> entry : entryList) {
                    // When there is a task left, add it to the queue
                    if(entry.getValue() > 0)
                        pq.offer(entry);
                }
                // Job done, break the process
                if(pq.isEmpty())
                    break;

                // if interval > 0, then it means we need to be idle
                count += interval;
            }
            return count;
        }
        // https://leetcode.com/problems/task-scheduler/discuss/104493/C%2B%2B-Java-Clean-Code-Priority-Queue
        // TODO:- Didn't studied/solved yet, need to do in the next revision.
        public int solve4(char[] tasks, int n) {
            Map<Character, Integer> counts = new HashMap<Character, Integer>();
            for (char t : tasks) {
                counts.put(t, counts.getOrDefault(t, 0) + 1);
            }

            PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b - a);
            pq.addAll(counts.values());

            int alltime = 0;
            int cycle = n + 1;
            while (!pq.isEmpty()) {
                int worktime = 0;
                List<Integer> tmp = new ArrayList<Integer>();
                for (int i = 0; i < cycle; i++) {
                    if (!pq.isEmpty()) {
                        tmp.add(pq.poll());
                        worktime++;
                    }
                }
                for (int cnt : tmp) {
                    if (--cnt > 0) {
                        pq.offer(cnt);
                    }
                }
                alltime += !pq.isEmpty() ? cycle : worktime;
            }

            return alltime;
        }
    }
}
