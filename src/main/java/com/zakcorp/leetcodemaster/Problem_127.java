package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_127 {
    static class Solver {
        public int solve1(String beginWord, String endWord, List<String> wordList) {
            Set<String> set = new HashSet<>(wordList);
            Queue<String> queue = new LinkedList<>();
            queue.add(beginWord);
            int depth = 1;
            while( !queue.isEmpty() ) {
                int size = queue.size();
                for(int i = 0; i < size; i++) {
                    String currWord = queue.poll();
                    if(currWord.equals(endWord))
                        return depth;
                    for(int j = 0; j < currWord.length(); j++) {
                        for(char k = 'a'; k <= 'z'; k++) {
                            char[] arr = currWord.toCharArray();
                            arr[j] = k;
                            String newWord = new String(arr);
                            if(set.contains(newWord)) {
                                queue.add(newWord);
                                set.remove(newWord);
                            }
                        }
                    }
                }
                depth++;
            }
            return 0;
        }
    }
}
