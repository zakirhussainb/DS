package com.zakcorp.gfg.md.course.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : Zakir
 * Question:  Check if string is rotated by two places
 * Result: Correct Answer
 * Execution Time: 0.08
 * TODO:
 *     Step 1: Use substring.
 *     Step 2: Check for clockwise rotation, if unmatched then also check for anti-clockwise rotation.
 */
public class MDGFG_Str05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            String str1 = br.readLine();
            String str2 = br.readLine();
            if(isStringMatchedByRotatingTwoPlaces(str1, str2)) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }

    private static boolean isStringMatchedByRotatingTwoPlaces(String str1, String str2) {
        String res2;
        res2 = str1.substring(2) + str1.substring(0, 2);
        if(!res2.equals(str2)) {
            res2 = str1.substring(str1.length() - 2) + str1.substring(0, str1.length() - 2);
        }
        return res2.equals(str2);
    }
}
