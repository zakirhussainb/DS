package com.zakcorp.codechef.beginner;

import java.util.*;

class SIMDISH {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                Set<String> set = new HashSet<>();
                int counter = 0;
                for(int i = 1; i <= 4; i++) {
                    set.add(in.readString());
                }
                for(int i = 1; i <= 4; i++){
                    if(set.contains(in.readString())) {
                        counter++;
                    }
                }
                out.printLine(counter >= 2 ? "similar" : "dissimilar");
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
}