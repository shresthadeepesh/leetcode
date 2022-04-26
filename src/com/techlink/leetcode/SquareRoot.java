package com.techlink.leetcode;

public class SquareRoot {

    public int sqrt(int x) {
        int i = 1;
        while(i<=x/i) {
            i++;
        }

        return (i-1);
    }

    public static void main(String[] args) {

        SquareRoot squareRoot = new SquareRoot();

        System.out.println(squareRoot.sqrt(69));


    }

}
