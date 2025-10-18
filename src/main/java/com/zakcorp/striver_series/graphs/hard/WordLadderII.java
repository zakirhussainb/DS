package com.zakcorp.striver_series.graphs.hard;

import java.util.*;

public class WordLadderII {
    static class Solver {
        public List<List<String>> findSequences(String beginWord, String endWord, List<String> wordList) {
            List<List<String>> result = new ArrayList<>();
            Set<String> set = new HashSet<>(wordList);
            set.remove(beginWord);

            Queue<List<String>> queue = new LinkedList<>();
            queue.add(new ArrayList<>(Collections.singletonList(beginWord)));

            Set<String> toEraseSet = new HashSet<>();

            while(!queue.isEmpty()) {
                int size = queue.size();
                for(int i = 0; i < size; i++) {
                    List<String> wordsInQueue = queue.poll();
                    String lastWord = wordsInQueue.get(wordsInQueue.size() - 1);

                    if(lastWord.equals(endWord)) {
                        result.add(new ArrayList<>(wordsInQueue));
                    }

                    char[] charArray = lastWord.toCharArray();
                    for(int j = 0; j < lastWord.length(); j++) {
                        char original = charArray[j];
                        for(char ch = 'a'; ch <= 'z'; ch++) {
                            charArray[j] = ch;
                            String newWord = new String(charArray);
                            if(set.contains(newWord)) {
                                wordsInQueue.add(newWord);
                                queue.add(new ArrayList<>(wordsInQueue));
                                toEraseSet.add(newWord);
                                wordsInQueue.remove(wordsInQueue.size() - 1);
                            }
                        }

                        charArray[j] = original;
                    }
                }

                for(String word : toEraseSet) {
                    set.remove(word);
                }
                toEraseSet.clear();

                if(!result.isEmpty()) break;
            }

            return result;
        }
    }
}
