package com.zakcorp.hackerrank.java;

import java.util.Scanner;

public class JavaSubStringComp {
    public static String getSmallestAndLargest(String str, int k) {

        // Complete the function
        String sequence = str.substring(0, k);
        String smallest = sequence;
        String largest = sequence;

        for(int i = 1; i <= (str.length() - k); i++) {
            sequence = str.substring(i, i + k);
            if(sequence.compareTo(smallest) < 0) {
                smallest = sequence;
            }
            if(sequence.compareTo(largest) > 0) {
                largest = sequence;
            }
        }

        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
