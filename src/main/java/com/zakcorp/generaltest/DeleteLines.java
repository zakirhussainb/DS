package com.zakcorp.generaltest;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class DeleteLines {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/zb/Downloads/lc.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/zb/Downloads/lc_res.txt"));
        String line = "";
        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            if(line.contains(". ")) {
                sb.append(line, 0, line.indexOf("."));
                sb.append("|");
                sb.append(line, line.indexOf(". ") + 2, line.length());
                sb.append("|");
            } else if( line.contains("Easy") || line.contains("Medium") || line.contains("Hard") ) {
                sb.append(line);
                set.add(sb.toString());
                sb = new StringBuilder();
            }
        }
        for(String l : set) {
            bw.write(l);
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
