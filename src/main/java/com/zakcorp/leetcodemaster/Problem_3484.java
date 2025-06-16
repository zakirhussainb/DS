package com.zakcorp.leetcodemaster;

public class Problem_3484 {
    static class Spreadsheet {
        private final int[][] spreadsheet;
        private static final int cols = 26;
        public Spreadsheet(int rows) {
            spreadsheet = new int[rows + 1][cols + 1];
        }

        public void setCell(String cell, int value) {
            int[] rc = findRowCol(cell);
            spreadsheet[rc[0]][rc[1]] = value;
        }

        public void resetCell(String cell) {
            setCell(cell, 0);
        }

        public int getValue(String formula) {
            String form = formula.substring(1);
            String[] split = form.split("\\+");
            String X = split[0];
            String Y = split[1];
            int sum = 0;
            if(isInteger(X)) {
                sum += Integer.parseInt(X);
            } else {
                int[] rc = findRowCol(X);
                sum += spreadsheet[rc[0]][rc[1]];
            }
            if(isInteger(Y)) {
                sum += Integer.parseInt(Y);
            } else {
                int[] rc = findRowCol(Y);
                sum += spreadsheet[rc[0]][rc[1]];
            }
            return sum;
        }

        private static boolean isInteger(String num) {
            boolean ans = false;
            try {
                Integer.parseInt(num);
                ans = true;
            } catch (NumberFormatException ignored) {
            }
            return ans;
        }

        private static int[] findRowCol(String cell) {
            char colCh = cell.charAt(0);
            String rowS = cell.substring(1);
            int rowI = Integer.parseInt(rowS);
            int colI = (colCh - 'A') + 1;
            return new int[]{rowI, colI};
        }
    }
}
