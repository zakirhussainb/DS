package com.zakcorp.codechef.beginner;

import java.util.*;

class FRGTNLNG {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int n = in.readInt();
                int k = in.readInt();
                String[] arr = new String[n];
                for(int i = 0; i < n; i++) {
                    arr[i] = in.readString();
                }
                Set<String> set = new HashSet<>();
                while(k --> 0) {
                    int l = in.readInt();
                    while(l --> 0) {
                        set.add(in.readString());
                    }
                }
                for(int i = 0; i < n; i++) {
                    if(set.contains(arr[i])) {
                        out.print("YES ");
                    } else {
                        out.print("NO ");
                    }
                }
                out.printLine();
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
}

