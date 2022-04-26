package com.techlink.leetcode;

import java.math.BigInteger;

public class BinarySum {

    public String addBinary(String a, String b) {
        BigInteger first = new BigInteger(a, 2);
        BigInteger second = new BigInteger(b, 2);
        BigInteger c = first.add(second);
        return c.toString(2);
    }

    public static void main(String[] args) {
        BinarySum b = new BinarySum();
        System.out.println(b.addBinary("1010", "1011"));
    }
}
