package com.techlink.leetcode;

public class ExcelSheetColumnNumber {

    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for(char c: columnTitle.toCharArray()) {
            int val = c;
            result *= 26;
            result = result + (val - 65 + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("ZY"));
        System.out.println(titleToNumber("A"));
    }

}
