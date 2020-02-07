package com.zakcorp.linkedlists.singly;

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

/* This class handles test cases for both LeetCode and GeeksForGeeks*/

public class SinglyLLProblemsTest {
    private static final boolean SORTED = false;
    @Test
    public void constructInput() throws Exception{
        FileInputStream file = new FileInputStream(new File("/Users/zb/zakir/zakir-local/data-structures-gfg.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("linkedlist-singly");
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
        SinglyLLProblemsLC sllc = new SinglyLLProblemsLC();
        if(isExecutable){
            SinglyLLIntImpl.Node head = createListFromGivenInput(input);
            Method method = sllc.getClass().getMethod(methodName, SinglyLLIntImpl.Node.class);
            if(method.getName().contains("oddEven") || method.getName().contains("copyRandomList")){
                SinglyLLIntImpl.Node resultHead = (SinglyLLIntImpl.Node) method.invoke(sllc, head);
                String resultOutput = constructOutput(resultHead);
                Assert.assertEquals(output, resultOutput);
            } else if(method.getName().contains("nextLarger")) {
                int[] result = (int[]) method.invoke(sllc, head);
                String resultOutput = constructOutput(result);
                Assert.assertEquals(output, resultOutput);
            } else {
                int resultOutput = (int) method.invoke(sllc, head);
                Assert.assertEquals(output, resultOutput);
            }
        }
    }

    private String constructOutput(SinglyLLIntImpl.Node result) {
        StringBuilder sb = new StringBuilder();
        while(result != null){
            sb.append(result.data).append(",");
            result = result.next;
        }
        String res = sb.toString();
        return res.substring(0,res.length() - 1);
    }
    private String constructOutput(int[] result) {
        StringBuilder sb = new StringBuilder();
        for(Integer i : result){
            sb.append(i).append(",");
        }
        String res = sb.toString();
        return res.substring(0,res.length() - 1);
    }

    /*private String constructOutput(DoublyLLIntImpl.Node result) {
        StringBuilder sb = new StringBuilder();
        while(result != null){
            sb.append(result.data).append(",");
            result = result.next;
        }
        String res = sb.toString();
        return res.substring(0,res.length() - 1);
    }*/

    private SinglyLLIntImpl.Node createListFromGivenInput(String input) {
        SinglyLLIntImpl sll = new SinglyLLIntImpl();
        String[] splitArr = input.split(",");
        for (String s : splitArr) {
            sll.add(Integer.parseInt(s));
        }
        return sll.head;
    }

    /*private DoublyLLIntImpl.Node createListFromGivenInput(String input, boolean sorted) {
        DoublyLLIntImpl dll = new DoublyLLIntImpl();
        String[] splitArr = input.split(",");
        for (String s : splitArr) {
            dll.addInSortedOrder(Integer.parseInt(s));
        }
        return dll.head;
    }*/
}
