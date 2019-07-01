package com.zakcorp.gfg.md.course.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author : Zakir
 * Question: Remove Duplicates
 * Result: Correct Answer
 * Execution Time: 0.18
 * TODO:
 *      Step 1: Use LinkedHashSet to remove the duplicate characters.
 */
public class MDGFG_Str03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            String line = br.readLine();
            removeDuplicates(line);
            System.out.println();
        }
    }

    private static void removeDuplicates(String line) {
        char[] chArr = line.toCharArray();
        Set<Character> set = new LinkedHashSet<>();
        for (char c : chArr) {
            set.add(c);
        }
        set.forEach(System.out::print);
    }
}
