package com.techlink.leetcode;

public class Palindrome {

    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int temp = x;
        int changed = 0;
        while(x != 0) {
            changed = changed * 10 + x % 10;
            x = x / 10;
        }
        return changed == temp;
    }

    public static void main(String[] args) {
        Palindrome main = new Palindrome();
        System.out.printf("%b", main.isPalindrome(-121));
        System.out.printf("%b", main.isPalindrome(121));
    }
}
