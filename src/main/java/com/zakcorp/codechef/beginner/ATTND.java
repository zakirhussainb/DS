package com.zakcorp.codechef.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class ATTND {
    public static void main(String[] args) throws Exception {
//        new Solver().solve();
        new Solver1().solve();
    }
    static class Solver {
        String[][] names;
        HashMap<String, Integer> firstNameMap;
        public void solve() throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int tc = Integer.parseInt(br.readLine());
            while(tc --> 0) {
                firstNameMap = new HashMap<>();
                int N = Integer.parseInt(br.readLine());
                names = new String[N][];
                for(int i = 0; i < N; ++i) {
                    String name = br.readLine();
                    String[] nameSplit = name.split("\\s+");
                    firstNameMap.put(nameSplit[0], firstNameMap.getOrDefault(nameSplit[0], 0) + 1);
                    names[i] = new String[] {nameSplit[0], nameSplit[1]};
                }
                for(String[] arr : names) {
                    System.out.print(arr[0] + " ");
                    if(firstNameMap.get(arr[0]) > 1) {
                        System.out.print(arr[1]);
                    }
                    System.out.println();
                }
            }
        }
    }
    static class Solver1 {
        String[][] names;
        HashMap<String, Integer> firstNameMap;
        public void solve() throws Exception {
            InputReader in = new InputReader(System.in);
            OutputWriter out = new OutputWriter(System.out);
            try {
                int tc = in.readInt();
                while(tc --> 0) {
                    firstNameMap = new HashMap<>();
                    int N = in.readInt();
                    names = new String[N][];
                    for(int i = 0; i < N; i++) {
                        String fN = in.readString();
                        String lN = in.readString();
                        firstNameMap.put(fN, firstNameMap.getOrDefault(fN, 0) + 1);
                        names[i] = new String[] {fN, lN};
                    }
                    for(String[] arr : names) {
                        System.out.print(arr[0]);
                        if(firstNameMap.get(arr[0]) > 1) {
                            System.out.print(" " + arr[1]);
                        }
                        System.out.println();
                    }
                }
                out.flush();
                out.close();
            } catch (Exception e) {}
        }
    }
}

