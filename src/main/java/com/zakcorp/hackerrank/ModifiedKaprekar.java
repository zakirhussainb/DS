package com.zakcorp.hackerrank;

import java.util.*;

/**
 * Created by Zakir Hussain B on 02/10/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class ModifiedKaprekar {
    public void kaprekarNumbers(int p, int q) {
        StringBuilder sb = new StringBuilder();
        for(long i = p; i <= q; i++) {
            if(i == 1) {
                System.out.print(1 + " ");
                continue;
            }
            findKaprekar(i, sb);
        }
        if(sb.length() == 0)
            System.out.println("INVALID RANGE");
        else
            System.out.println(sb.toString());
    }
    public void findKaprekar(long num, StringBuilder sb) {
        long m = num * num;
        String str = String.valueOf(m);
        String s1 = str.substring(0, str.length()/2);
        String s2 = str.substring(str.length()/2);
        long n1 = s1.isEmpty() ? 0 : Long.parseLong(s1);
        long n2 = s2.isEmpty() ? 0 : Long.parseLong(s2);
        long result = n1 + n2;
        if(result == num) {
            sb.append(num).append(" ");
        }
    }
}