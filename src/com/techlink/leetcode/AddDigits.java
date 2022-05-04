package com.techlink.leetcode;

public class AddDigits {

    public static int addDigits(int num) {
        int result = num;

        while(result >= 10) {
            result = makeSum(result);
        }

        return result;
    }

    private static int makeSum(int num) {
        int result = 0;
        while(num != 0) {
            result = result + num % 10;
            num /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(38));
        System.out.println(addDigits(10));
    }

}
