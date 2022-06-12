package com.zakcorp.leetcodemaster.contest;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Problem_D {
    static class Solver {
        public long solve1(String[] ideas) {
            long counter = 0;
            Set<String> set = new HashSet<>(Arrays.asList(ideas));
            for(int i = 0; i < ideas.length; i++) {
                for(int j = 0; j < ideas.length; j++) {
                    String swappedStr = swap(ideas[i], ideas[j]);
                    String[] sdg = swappedStr.split("\\s+");
                    if( !set.contains(sdg[0]) && !set.contains(sdg[1]) ) {
                        counter++;
                    }
                }
            }
            return counter;
        }
        private String swap(String str1, String str2) {
            char[] chArr1 = str1.toCharArray();
            char[] chArr2 = str2.toCharArray();
            char temp = chArr2[0];
            chArr2[0] = chArr1[0];
            chArr1[0] = temp;
            String s1 = new String(chArr1);
            String s2 = new String(chArr2);
            return s1 + " " + s2;
        }
    }

}
