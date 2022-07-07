package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_409 {
    static class Solver {
        public int solve1(String str) {
            int n = str.length();
            if(n == 1)
                return n;
            Set<Character> set = new HashSet<>();
            int counter = 0;
            for(int i = 0; i < n; i++) {
                char ch = str.charAt(i);
                if(set.contains(ch)) {
                    set.remove(ch);
                    counter++;
                } else {
                    set.add(ch);
                }
            }
            // Explanation with an example:
            // aaaa - a occurs 4 times - so LEFT [aa] - RIGHT [aa] -> counter = 2
            // dd - d occurs 2 times - so LEFT [d] - RIGHT [d] -> counter += 1 => 3
            // if the set is empty means, there is no unique character and all the chars occur more than once,
            // Hence counter * 2 => 2 [1 for Left] and [1 for Right]
            // otherwise if set is not empty() -> then you have to consider 1 unique character
            // Hence counter * 2 + 1 => 2 [1 for Left] and [1 for Right] + [1 Unique Char in Mid]
            return set.isEmpty() ? counter * 2 : counter * 2 + 1;
        }
    }
}
