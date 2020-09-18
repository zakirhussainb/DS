package com.zakcorp.leetcodemaster;

import java.util.*;

/**
 * Created by Zakir Hussain B on 18/09/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Problem_567 {
    public boolean checkInclusion(String s1, String s2) {
        Set<String> set = new HashSet<>();
        permute(s1, 0, s1.length() - 1, set);
        for(String str : set) {
            if(s2.contains(str)) {
                return true;
            }
        }
        return false;
    }

    private void permute(String s1, int l, int r, Set<String> set) {
        if(l == r) {
            set.add(s1);
        }
        for(int i = l; i <= r; i++) {
            s1 = swap(s1, l, i);
            permute(s1, l + 1, r, set);
            s1 = swap(s1, l, i);
        }
    }

    private String swap(String s1, int l, int r) {
        char[] chArr = s1.toCharArray();
        char temp = chArr[l];
        chArr[l] = chArr[r];
        chArr[r] = temp;
        return String.valueOf(chArr);
    }
}