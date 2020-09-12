package com.zakcorp.hackerrank;

import java.util.*;
import java.io.*;

/**
 * Created by Zakir Hussain B on 12/09/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class JesseAndCookies {

    /*
     * Complete the cookies function below.
     */
    static int cookies(int K, int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : arr) {
            pq.add(num);
        }
        int operations = 0;
        while(!pq.isEmpty() && pq.peek() < K) {
            int x = pq.poll();
            if(!pq.isEmpty()) {
                int y = pq.poll();
                int num = x + 2 * y;
                pq.add(num);
                operations++;
            }
        }
        return pq.isEmpty() ? -1 : operations;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0].trim());

        int k = Integer.parseInt(nk[1].trim());

        int[] A = new int[n];

        String[] AItems = scanner.nextLine().split(" ");

        for (int AItr = 0; AItr < n; AItr++) {
            int AItem = Integer.parseInt(AItems[AItr].trim());
            A[AItr] = AItem;
        }

        int result = cookies(k, A);
        System.out.println("result...." + result);
    }
}