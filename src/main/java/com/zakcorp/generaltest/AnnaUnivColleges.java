package com.zakcorp.generaltest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class AnnaUnivColleges {
    static class CollegeInfo {
        private String collegeName;
        private String collegeCode;
        private String branchName;
        private String cutOff_OC;
        private String cutOff_BC;
        private String cutOff_BCM;

    }
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/zb/Downloads/college_cutoff_tnea.json"));
        //JSON parser object to parse read file


    }
    private CollegeInfo parseJson(String json) {
        return null;
    }
}
