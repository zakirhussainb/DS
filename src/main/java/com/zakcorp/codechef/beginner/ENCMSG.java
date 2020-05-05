package com.zakcorp.codechef.beginner;

class ENCMSG {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int N = in.readInt();
                String str = in.readString();
                out.printLine(new Solver().solve(str, N));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(String str, int N) {
            StringBuilder sb = new StringBuilder();
            char[] arr = str.toCharArray();
            for(int i = 0; i < N; i+=2) {
                if( (i + 1) < N) {
                    swap(i, i + 1, arr);
                }
            }
            for(int i = 0; i < N; i++) {
                sb.append(encode(arr[i]));
            }
            return sb.toString();
        }
        private Character encode(char ch) {
//            char[] chars = {'z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n',
//            'm', 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a'};
            char[] chars = new char[26];
            char tmp = 'z';
            for(int i = 0; i < 26; i++){
                chars[i] = tmp--;
            }
            return chars[ch - 'a'];
        }
        private void swap(int c1, int c2, char[] arr) {
            char temp = arr[c1];
            arr[c1] = arr[c2];
            arr[c2] = temp;
        }
    }
}

