package com.zakcorp.gfg.md.course.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author : Zakir
 * Question: Anagram
 * Result: Correct Answer
 * Execution Time: 0.78
 * TODO:
 */
public class MDGFG_Str01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            String line1 = br.readLine();
            String[] line1Arr = line1.split("\\s+");
            String s1 = line1Arr[0];
            String s2 = line1Arr[1];
            if (isAnagram(s1, s2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean isAnagram(String s1, String s2) {
        /*
        Step 1: Convert the strings into character array.
        Step 2: Sort the character arrays.
        Step 3: Create new string from the sorted character arrays.
        Step 4: Check the new strings for equality.
         */

        // Step 1: Convert the strings into character array.
        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();

        // Step 2: Sort the character arrays.
        Arrays.sort(char1);
        Arrays.sort(char2);

        // Step 3: Create new string from the sorted character arrays.

        String str1 = new String(char1);
        String str2 = new String(char2);

        // Step 4: Check the new strings for equality.
        return str1.equals(str2);
    }
}
