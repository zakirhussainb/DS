package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_859 {
    public boolean buddyStrings(String A, String B) {
        // If the lengths of the two strings are not equal, then they are clearly not buddies.
        if( A.length() != B.length() ) {
            return false;
        }
        // This is for the edge case, where the two strings are equal.
        // A = "aa"; B = "aa" and A = "ab"; B = "ab"
        if(A.equals(B)) {
            Set<Character> set = new HashSet<>();
            for(char ch : A.toCharArray()) {
                set.add(ch);
            }
            return set.size() < A.length();
        }
        // If the letters are not equal then store the index in an integer list.
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < A.length(); i++) {
            if(A.charAt(i) != B.charAt(i)) {
                list.add(i);
            }
        }
        // For two strings to be "Buddy Strings" the number of letters swappable must be only 2.
        if(list.size() == 2) {
            // Now we know that list will surely contain only two indices.
            // So we need to compare the "index-0(list) of string A" with "index-1(list) of string B"
            // Similarly we need to compare the "index-1(list) of string A" with "index-0(list) of string B"
            return A.charAt(list.get(0)) == B.charAt(list.get(1)) && A.charAt(list.get(1)) == B.charAt(list.get(0));
        }
        return false;
    }
}
