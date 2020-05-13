package com.zakcorp.codechef.beginner;

class RAINBOWA {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int N = in.readInt();
                int[] arr = new int[N];
                for(int i = 0; i < N; i++) {
                    arr[i] = in.readInt();
                }
                out.printLine(new Solver().solve1(arr, N));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(int[] arr, int N) {
            int[] hashArr = new int[N + 1];
            for(int i = 0; i < N; i++) {
                if(hashArr[arr[i]] != 0) {
                    hashArr[arr[i]]--;
                } else {
                    hashArr[arr[i]]++;
                }
            }
            return "Yes";
        }
        public String solve1(int[] arr, int N) {
            int low = 0;
            int high = N - 1;
            while(low < high) {
                if(arr[low] == arr[high]) {
                    low++;
                    high--;
                } else {
                    return "No";
                }
            }
            if(arr[low] != 7 || arr[high] != 7) {
                return "No";
            }
            return "Yes";
        }
    }
}
