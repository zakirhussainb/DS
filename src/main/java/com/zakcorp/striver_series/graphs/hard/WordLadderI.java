package com.zakcorp.striver_series.graphs.hard;

import java.util.*;

public class WordLadderI {
    static class Solver {

        static class Pair {
            String word;
            int level;
            public Pair(String word, int level) {
                this.word = word;
                this.level = level;
            }
        }
        public int wordLadderLength(String startWord, String targetWord, List<String> wordList) {
            // Step 0: Convert the wordList into a set, If the targetWord is not present return 0, as it is not possible to transform.
            // Step 1: Remove the startWord from the wordList if it is present.
            // Step 2: Insert the startWord into the Queue, with the current level that is 1.
            // Step 3: While the queue is not empty:
                // Step 3.1: Extract the current word and its step count. If the current word matches the target word, return the step count.
                // Step 3.2: For each character in the current word, change it to every letter from 'a' to 'z'. For each transformation:
                    // Step 3.2.1: Check if the new word formed is in the hash set.
                    // Step 3.2.2: If found, remove it from the set, marking it as visited, and add it to the queue with an incremented step count.
                // Step 3.3: Initialize the original character back into the char array.
            // Step 4: If the queue is exhausted without finding the target word, return 0.

            Set<String> set = new HashSet<>(wordList);
            if (!set.contains(targetWord)) return 0;
            set.remove(startWord);

            Queue<Pair> queue = new LinkedList<>();
            queue.add(new Pair(startWord, 1));

            while(!queue.isEmpty()) {
                Pair p = queue.poll();
                String word = p.word;
                int level = p.level;

                if(word.equals(targetWord)) {
                    return level;
                }

                char[] charArray = word.toCharArray();
                for(int i = 0; i < word.length(); i++) {
                    char original = charArray[i];
                    for(char ch = 'a'; ch <= 'z'; ch++) {
                        charArray[i] = ch;
                        String newWord = new String(charArray);

                        if(set.contains(newWord)) {
                            set.remove(newWord);
                            queue.add(new Pair(newWord, level + 1));
                        }
                    }
                    charArray[i] = original;
                }
            }

            return 0;
        }
    }
}
