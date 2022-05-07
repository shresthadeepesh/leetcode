package com.techlink.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FibonacciSeries {

    private Map<Integer, Integer> cache = new HashMap<>();

    public int fibonacci(int n) {
        if(n == 0 || n == 1) return n;

        if(cache.containsKey(n)) {
            return cache.get(n);
        }

        int result = fibonacci(n-1) + fibonacci(n-2);
        cache.put(n, result);

        return result;
    }

    public static void main(String[] args) {
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        System.out.println(fibonacciSeries.fibonacci(5));
        System.out.println(fibonacciSeries.fibonacci(7));
        System.out.println(fibonacciSeries.fibonacci(35));
    }

}
