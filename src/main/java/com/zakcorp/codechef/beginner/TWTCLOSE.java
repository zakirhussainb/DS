package com.zakcorp.codechef.beginner;

import java.util.Arrays;

class TWTCLOSE {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int N = in.readInt();
            int K = in.readInt();
            int[] hashArr = new int[N + 1];
            int counter = 0;
            while(K --> 0) {
                String click = in.readString();
                int tweetNo;
                if(!click.equals("CLOSEALL")) {
                    tweetNo = in.readInt();
                } else {
                    counter = 0;
                    Arrays.fill(hashArr, 0);
                    out.printLine(counter);
                    continue;
                }
                if(hashArr[tweetNo] != 0) {
                    hashArr[tweetNo] = 0;
                    counter--;
                } else {
                    hashArr[tweetNo] = 1;
                    counter++;
                }
                // Dont need to unnecessary read the entire array -> It will increase the time complexity
//                for (int i = 1; i < hashArr.length; i++) {
//                    counter += hashArr[i];
//                }
                out.printLine(counter);
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
}

