package com.zakcorp.gfg.md.course.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author : Zakir
 * Question: Implement strstr
 * Result:
 * Execution Time:
 * TODO:
 */
public class MDGFG_Str07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            String line = br.readLine();
            String[] arr = line.split("\\s+");
            String s = arr[0];
            String x = arr[1];
            System.out.println(strstr(s, x));
        }
    }

    private static int strstr(String str, String target) {
        return str.indexOf(target);
    }

}
