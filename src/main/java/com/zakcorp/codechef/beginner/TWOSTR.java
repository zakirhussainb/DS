package com.zakcorp.codechef.beginner;

class TWOSTR {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                String str1 = in.readString();
                String str2 = in.readString();
                out.printLine(new Solver().solve(str1, str2));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(String str1, String str2){
            boolean flag = true;
            for(int i = 0; i < str1.length(); i++) {
                if( Character.isLetter(str1.charAt(i)) && (str2.charAt(i) == '?') ||
                        str1.charAt(i) == '?' && Character.isLetter(str2.charAt(i)) ) {
                } else if( str1.charAt(i) != str2.charAt(i) ) {
                    flag = false;
                } else if(str1.charAt(i) == str2.charAt(i)) {
                }
            }
            return flag ? "Yes" : "No";
        }
    }
}
