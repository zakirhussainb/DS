package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_690 {
    static class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
        public Employee(int id, int importance, List<Integer> subordinates) {
            this.id = id;
            this.importance = importance;
            this.subordinates = subordinates;
        }
    }
    static class Solver {
        public int solve1(List<Employee> employees, int key) {
            Map<Integer, Employee> empMap = new HashMap<>();
            for(Employee emp : employees) {
                empMap.put(emp.id, emp);
            }
            int[] result = {0};
            for(Map.Entry<Integer, Employee> entry : empMap.entrySet()) {
                if(entry.getKey() == key) {
                    dfs(key, empMap, result);
                    break;
                }
            }
            return result[0];
        }
        private void dfs(int key, Map<Integer, Employee> empMap, int[] result) {
            if( empMap.get(key).subordinates.isEmpty() ) {
                result[0] += empMap.get(key).importance;
                return;
            }
            result[0] += empMap.get(key).importance;
            for(Integer subId : empMap.get(key).subordinates) {
                dfs(subId, empMap, result);
            }
        }
    }
}
