package com.zakcorp.linkedlists.doubly;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;

public class DoublyLLProblemsGFGTest {

    private static final boolean SORTED = false;
    @Test
    public void constructInput() throws Exception{
        FileInputStream file = new FileInputStream(new File("/Users/zb/zakir/zakir-local/linkedlists.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);
        for (Row row : sheet) {
            String methodName = "";
            String input = "";
            int splInput = 0;
            String output = "";
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
                        splInput = (int)cell.getNumericCellValue();
                        break;
                    case 4:
                        output = cell.getStringCellValue();
                        break;
                }
                i++;
            }
            executeProblems(methodName, input, splInput, output);
        }
        file.close();
    }

    public void executeProblems(String methodName, String input, int splInput, String output) throws Exception{
        DoublyLLProblemsGFG dll = new DoublyLLProblemsGFG();
        DoublyLLIntImpl.Node head = createListFromGivenInput(input);
        Method method = dll.getClass().getMethod(methodName, DoublyLLIntImpl.Node.class, int.class);
        String resultOutput;
        if(method.getName().contains("countTriplets")){
            resultOutput = (String) method.invoke(dll, head, splInput);
        } else if(method.getName().contains("insertInSortedOrder")){
            head = createListFromGivenInput(input, SORTED);
            resultOutput = constructOutput(head);
        } else if(method.getName().contains("Palindrome")){
            resultOutput = (String) method.invoke(dll, head, splInput);
        } else {
            DoublyLLIntImpl.Node result = (DoublyLLIntImpl.Node) method.invoke(dll, head, splInput);
            resultOutput = constructOutput(result);
        }
        Assert.assertEquals(output, resultOutput);
    }

    private String constructOutput(DoublyLLIntImpl.Node result) {
        StringBuilder sb = new StringBuilder();
        while(result != null){
            sb.append(result.data).append(",");
            result = result.next;
        }
        String res = sb.toString();
        return res.substring(0,res.length() - 1);
    }

    private DoublyLLIntImpl.Node createListFromGivenInput(String input) {
        DoublyLLIntImpl dll = new DoublyLLIntImpl();
        String[] splitArr = input.split(",");
        for (String s : splitArr) {
            dll.add(Integer.parseInt(s));
        }
        return dll.head;
    }

    private DoublyLLIntImpl.Node createListFromGivenInput(String input, boolean sorted) {
        DoublyLLIntImpl dll = new DoublyLLIntImpl();
        String[] splitArr = input.split(",");
        for (String s : splitArr) {
            dll.addInSortedOrder(Integer.parseInt(s));
        }
        return dll.head;
    }
}
