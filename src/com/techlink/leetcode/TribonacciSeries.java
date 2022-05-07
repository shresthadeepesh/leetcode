package com.techlink.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TribonacciSeries {

    private Map<Integer, Integer> cache = new HashMap<>();

    public int tribonacci(int n) {
        if(n == 0 || n == 1) return n;
        if(n == 2) return 1;

        if(cache.containsKey(n)) {
            return cache.get(n);
        }

        int result = tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
        cache.put(n, result);

        return result;
    }

    public static void main(String[] args) {
        TribonacciSeries tribonacciSeries = new TribonacciSeries();
        System.out.println(tribonacciSeries.tribonacci(4));
        System.out.println(tribonacciSeries.tribonacci(25));
        System.out.println(tribonacciSeries.tribonacci(35));
    }

}
