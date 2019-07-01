package com.zakcorp.gfg.md.course.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author : Zakir
 * Question: Reverse words in a given string
 * Result: Correct Answer
 * Execution Time: 0.07
 * TODO:
 *      Step 1: Split the string with the given character either (" ") or (".") and form an array.
 *      Step 2: Reverse the array and append into a StringBuilder, remove the extra character at the end of string, if any.
 */
public class MDGFG_Str02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            String line = br.readLine();
            String[] arr = line.split("\\.");
            getReversedString(arr, arr.length);
        }
    }

    private static void getReversedString(String[] arr, int length) {
        StringBuilder sb = new StringBuilder();
        for(int i = length - 1; i >= 0; i--) {
            sb.append(arr[i]).append(".");
        }
        String result = sb.toString();
        if(result.endsWith(".")) {
            System.out.println(result.substring(0, result.length() - 1));
        } else {
            System.out.println(result);
        }
    }
}
