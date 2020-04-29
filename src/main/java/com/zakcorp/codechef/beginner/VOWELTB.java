package com.zakcorp.codechef.beginner;

class VOWELTB {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            String character = in.readString();
            System.out.println(new Solver().solve(character));
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(String character) {
            if(character.equals("A") || character.equals("E") || character.equals("I") ||
                    character.equals("O") || character.equals("U")) {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
    }
}

