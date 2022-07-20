package com.zakcorp.generaltest;

import java.io.*;
import java.util.*;

public class RolexListCreation {
    static class RolexObj {
        private TreeSet<String> companies;
        private int problemID;
        private String problem;
        private String problemTopics;
        private String difficulty;
        public RolexObj(TreeSet<String> companies, int problemID, String problem, String problemTopics, String difficulty) {
            this.companies = companies;
            this.problemID = problemID;
            this.problem = problem;
            this.problemTopics = problemTopics;
            this.difficulty = difficulty;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/zb/Documents/Rolex_List_Input.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/zb/Documents/Rolex_List_Output.txt"));
        String line = "";
        Map<Integer, RolexObj> map = new HashMap<>();
        while ((line = br.readLine()) != null) {
            String[] splitArr = line.split("\\|\\|");
            String company = splitArr[0].trim();
            int problemID = Integer.parseInt(splitArr[1].trim());
            String problem = splitArr[2].trim();
            String problemTopics = splitArr[3].trim();
            String difficulty = splitArr[4].trim();

            if(!map.containsKey(problemID)) {
                map.put(problemID, new RolexObj(new TreeSet<>(), problemID, problem, problemTopics, difficulty));
            }
            map.get(problemID).companies.add(company);
        }
        for(Map.Entry<Integer, RolexObj> entry : map.entrySet()) {
            RolexObj rolexObj = entry.getValue();
            String res = rolexObj.companies + "|" + rolexObj.problemID + "|" + rolexObj.problem + "|" + rolexObj.problemTopics
                    + "|" + rolexObj.difficulty;
            bw.write(res);
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}


// Amazon	||	1	||	Two Sum	||	ArrayHash Table	||	Easy
//Amazon	||	2	||	Add Two Numbers	||	Linked ListMathRecursion	||	Medium
