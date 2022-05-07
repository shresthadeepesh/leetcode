package com.techlink.leetcode;

public class ReformatDate {

    public static String reformatDate(String date) {
        String[] d = date.split(" ");

        String day = getDay(d[0]);
        String month = getMonth(d[1]);

        return String.format("%s-%s-%s", d[2], month, day);
    }

    private static String getMonth(String month) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        for(int i=0; i<months.length; i++) {
            if(months[i].equals(month)) {
                if(i < 9) {
                    return String.format("0%d", i+1);
                }
                return String.format("%d", i+1);
            }
        }

        return null;
    }

    private static String getDay(String date) {
        StringBuilder stringBuilder = new StringBuilder(date);

        if(date.length() < 4) {
            stringBuilder.replace(1,3, "");
            stringBuilder.insert(0, "0");
            return stringBuilder.toString();
        }

        stringBuilder.replace(2,4, "");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(reformatDate("20th Oct 2052"));
        System.out.println(reformatDate("6th Jun 1933"));
    }

}
