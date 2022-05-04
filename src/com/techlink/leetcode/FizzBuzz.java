package com.techlink.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            String s = "";
            if(i % 3 == 0) {
                s += "Fizz";
            }

            if(i % 5 == 0) {
                s += "Buzz";
            }

            if(s.equals("")) {
                s += Integer.toString(i);
            }

            result.add(s);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(5));
        System.out.println(fizzBuzz(15));
    }

}
