package com.zakcorp.arrays.basic;

import java.util.*;

public class GFGArrB008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T --> 0) {
            int N = sc.nextInt();
            String[] arr = new String[N];
            for(int i = 0; i < N; i++) {
                arr[i] = sc.next();
            }
            String smallestElement = getSmallestElement(arr);
            System.out.println(findLongestCommonPrefix(smallestElement, arr));
        }
    }

    private static String getSmallestElement(String[] arr) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String anArr : arr) {
            map.put(anArr, anArr.length());
        }
        Map.Entry<String, Integer> min = null;
        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            if(min == null || min.getValue() > entry.getValue()) {
                min = entry;
            }
        }
        return min != null ? min.getKey() : null;
    }

    private static String findLongestCommonPrefix(String small, String[] arr) {
        int counter = 0;
        for (String anArr : arr) {
            if ( (anArr.contains(small) && small.length() > 1) || (anArr.equals(small)) ) {
                counter++;
                if (counter == arr.length) {
                    return small;
                }
            } else {
                if(small.length() != 0) {
                    return findLongestCommonPrefix(small.substring(0, small.length() - 1), arr);
                }
            }
        }
        return "-1";
    }
}
