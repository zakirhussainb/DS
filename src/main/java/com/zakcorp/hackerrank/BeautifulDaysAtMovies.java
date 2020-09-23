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
public class BeautifulDaysAtMovies {
    public int beautifulDays(int x, int y, int k) {
        int beautifulDays = 0;
        for(int i = x; i <= y; i++) {
            if( Math.abs(i - reverse(i)) % k == 0) {
                beautifulDays++;
            }
        }
        return beautifulDays;
    }

    private static int reverse(int num) {
        StringBuilder sb = new StringBuilder();
        while(num != 0) {
            sb.append(num % 10);
            num = num / 10;
        }
        return Integer.parseInt(sb.toString());
    }
}