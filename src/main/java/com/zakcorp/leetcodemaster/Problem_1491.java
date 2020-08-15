package com.zakcorp.leetcodemaster;

public class Problem_1491 {
    public double average(int[] salary) {
        int min = salary[0], max = salary[0];
        for(int i = 1; i < salary.length; i++) {
            min = Math.min(min, salary[i]);
            max = Math.max(max, salary[i]);
        }
        int sum = 0;
        for (int value : salary) {
            if (value != min && value != max) {
                sum += value;
            }
        }
        return (double) sum / (salary.length - 2);
    }
}
