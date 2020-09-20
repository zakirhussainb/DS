package com.zakcorp.hackerrank;

import java.util.*;
import java.io.*;

/**
 * Created by Zakir Hussain B on 19/09/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class DrawingBook {
    static class Pair {
        int first;
        int second;
        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        int minTurns = 0;
        List<Pair> arrList = new ArrayList<>();
        arrList.add(new Pair(1, 1));
        for(int i = 2; i <= n; i+=2) {
            if(i + 1 > n) {
                arrList.add(new Pair(i, i));
            } else {
                arrList.add(new Pair(i, i + 1));
            }
        }
        int x = 0, y = arrList.size() - 1;
        int fromStart = 0, fromLast = 0, turns = 0;
        while(x < arrList.size() && y > 0) {
            if(arrList.get(x).first == p || arrList.get(x).second == p) {
                fromStart = turns;
            }
            if(arrList.get(y).first == p || arrList.get(y).second == p) {
                fromLast = turns;
            }
            turns++;
            x++;
            y--;
            minTurns = Math.min(fromStart, fromLast);
        }
        return minTurns;
    }
    static int pageCount1(int n, int p) {
        int totalPageTurnCountFromFront = n / 2;
        int targetPageTurnCountFromFront = p / 2;
        int targetPageTurnCountFromBack = totalPageTurnCountFromFront - targetPageTurnCountFromFront;
        return Math.min(targetPageTurnCountFromFront, targetPageTurnCountFromBack);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

//        System.out.println(pageCount(n, p));
        System.out.println(pageCount1(n, p));
        scanner.close();
    }
}
