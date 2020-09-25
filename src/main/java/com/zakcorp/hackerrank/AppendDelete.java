package com.zakcorp.hackerrank;

/**
 * Created by Zakir Hussain B on 23/09/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class AppendDelete {
    public String appendAndDelete1(String s, String t, int k) {
        // hackerhappy
        // hackerrank
        // 9
        int i = 0, j = 0;
        while(i < s.length() && j < t.length()) {
            char sCh = s.charAt(i);
            char tCh = t.charAt(j);
            if(sCh != tCh) {
                k = k - 2;
            }
            i++; j++;
        }
        while(i < s.length()) {
            k--;
            i++;
        }
        while(j < t.length()) {
            k--;
            j++;
        }
        return k >= 0 ? "Yes" : "No";
    }
    public String appendAndDelete(String s, String t, int k) {
        int val = s.lastIndexOf(t);
        return "";
    }

}