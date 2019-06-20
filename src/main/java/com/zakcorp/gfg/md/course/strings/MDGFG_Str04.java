package com.zakcorp.gfg.md.course.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : Zakir
 * Question:  Print length of smallest substring with maximum number of distinct characters.
 * Result: Correct Answer
 * Execution Time: 0.08
 * TODO:
 *      This problem solves two questions:-
 *          1. Find the distinct substring in a given string.
 *          1. Find the length of distinct substring in a given string.
 *      Method 1: Brute Force
 *          Step 1: Create a String array by spliting the input string.
 *          Step 2: Declare resultant string variable and initialize a maxLen value.
 *          Step 3: Use a for loop to initialize the s2 with s1Array.
 *              Step 3.1: Use a inner for loop to check whether s2 contains s1Array element.
 *                        If yes, then add the character, else break the loop.
 *              Step 3.2: Store the value of s2 in x and check it against max value.
 *              Example:
 *              Input:
 *              2
 *              abababcdefababcdab
 *              geeksforgeeks
 *              Output:
 *              6
 *              7
 */
public class MDGFG_Str04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            String line = br.readLine();
            System.out.println(findLengthOfSmallestDistinctSubstring(line, line.length()));
        }
    }

    private static String findLengthOfSmallestDistinctSubstring(String str, int n) {
        String[] s1Arr = str.trim().split("");
        String s2;
        String result = "";
        int max = 0;
        for(int i = 0; i < n - 1; i++) {
            s2 = s1Arr[i];
            for(int j = i + 1; j < n; j++) {
                if(!s2.contains(s1Arr[j])) {
                    s2 = s2 + s1Arr[j];
                } else {
                    break;
                }
            }
            s2 = s2.trim();
            int x = s2.length();
            if (x > max) {
                max = x;
            }
            if(s2.length() == max) {
                result = s2;
            }
        }
        System.out.println(max);
        return result;
    }
}
