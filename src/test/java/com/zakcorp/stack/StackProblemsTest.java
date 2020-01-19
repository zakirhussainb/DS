package com.zakcorp.stack;

import com.zakcorp.linkedlists.doubly.DoublyLLIntImpl;
import com.zakcorp.linkedlists.doubly.DoublyLLProblemsGFG;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;

public class StackProblemsTest {
    @Test
    public void constructInput() throws Exception{
        FileInputStream file = new FileInputStream(new File("/Users/zb/zakir/zakir-local/data-structures-gfg.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("stack");
        for (Row row : sheet) {
            String methodName = "";
            String input = "";
            String output = "";
            boolean isExecutable = false;
            int i = 1;
            for(Cell cell: row) {
                switch (i) {
                    case 1:
                        methodName = cell.getStringCellValue();
                        break;
                    case 2:
                        input = cell.getStringCellValue();
                        break;
                    case 3:
                        output = cell.getStringCellValue();
                        break;
                    case 4:
                        isExecutable = cell.getBooleanCellValue();
                        break;
                }
                i++;
            }
            executeProblems(methodName, input, output, isExecutable);
        }
        file.close();
    }

    public void executeProblems(String methodName, String input, String output, boolean isExecutable) throws Exception{
        StackProblemsGFG stPro = new StackProblemsGFG();
        StackProblemsLC stLC = new StackProblemsLC();
        if(isExecutable){
            if(methodName.equalsIgnoreCase("easyString")){
                Method method = stPro.getClass().getMethod(methodName, String.class);
                String result = (String) method.invoke(stPro, input);
                Assert.assertEquals(output, result);
                return;
            } else if(methodName.contains("calPoints")){
                Method method = stLC.getClass().getMethod(methodName, String.class);
                String result = (String) method.invoke(stPro, input);
                Assert.assertEquals(output, result);
                return;
            }
            int[] arr = createArrayFromInput(input);
            Method method = stPro.getClass().getMethod(methodName, int[].class);
            int[] outputArr = (int[]) method.invoke(stPro, arr);
            String resultOutput = constructOutput(outputArr);
            Assert.assertEquals(output, resultOutput);
        }
    }

    private String constructOutput(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int value : arr) {
            sb.append(value).append(",");
        }
        String res = sb.toString();
        return res.substring(0,res.length() - 1);
    }

    private int[] createArrayFromInput(String input) {
        int n = input.length();
        String[] splitArr = input.split(",");
        int[] arr = new int[splitArr.length];
        for(int i = 0; i < splitArr.length; i++){
            arr[i] = Integer.parseInt(splitArr[i]);
        }
        return arr;
    }

}
