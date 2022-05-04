package com.techlink.leetcode;

public class ExcelSheetColumnTitle {

    public static String convertToTitle(int columnNumber) {
        StringBuilder stringBuilder = new StringBuilder();

        while(columnNumber > 0) {
            char c = (char) ((columnNumber - 1) % 26 + 65);
            stringBuilder.append(c);
            columnNumber = (columnNumber - 1) / 26;
        }

        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }

}
