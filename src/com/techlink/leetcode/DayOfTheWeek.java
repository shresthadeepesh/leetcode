package com.techlink.leetcode;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DayOfTheWeek {

    public static String dayOfTheWeek(int day, int month, int year) {
        SimpleDateFormat getDay = new SimpleDateFormat("EEEE");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dateFormat = String.format("%d/%d/%d", day, month, year);

        try {
            Date date = simpleDateFormat.parse(dateFormat);

            return getDay.format(date);
        } catch (ParseException parseException) {
            System.out.println("Parse exception.");
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(dayOfTheWeek(31, 8, 2019));
        System.out.println(dayOfTheWeek(6, 5, 2022));
    }

}
