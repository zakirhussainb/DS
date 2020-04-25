package com.zakcorp.codechef.beginner;

class FLOW010 {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        try {
            int tc = in.readInt();
            while(tc --> 0) {
                String str = in.readString();
                System.out.println(new Solver().solve(str));
            }
            out.flush();
            out.close();
        } catch (Exception e){}
    }
    static class Solver {
        public String solve(String classId) {
            classId = classId.toLowerCase();
            switch (classId) {
                case "b":
                    return "BattleShip";
                case "c":
                    return "Cruiser";
                case "d":
                    return "Destroyer";
                case "f":
                    return "Frigate";
            }
            return "-1";
        }
    }
}

