package com.zakcorp.codechef.beginner;

class HEADBOB {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                int N = in.readInt();
                String str = in.readString();
                System.out.println(new Solver().solve1(N, str));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(int N, String str) {
            String result = "";
            if(!str.contains("I") &&!str.contains("Y")){
                result = "NOT SURE";
            }
            if(str.contains("I")){
                result = "INDIAN";
            } else if(str.contains("Y")){
                result = "NOT INDIAN";
            }
            return result;
        }
        public String solve1(int N, String str) {
            String result = "NOT SURE";
            for(int i = 0; i < str.length(); i++){
                if (str.charAt(i) == 'I'){
                    result = "INDIAN";
                    break;
                } else if(str.charAt(i) == 'Y'){
                    result = "NOT INDIAN";
                    break;
                }
            }
            return result;
        }
    }
}

