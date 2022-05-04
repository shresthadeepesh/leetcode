package com.techlink.leetcode;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        return removeSpecial(s).equals(removeSpecial(reverseString(s)));
    }

    private static String reverseString(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        return stringBuilder.reverse().toString();
    }

    private static String removeSpecial(String s) {
        String pattern = "[-+.^:,\\s@#!$%^&*(){}\\[\\]_\"\'?;`]";
        return s.replaceAll(pattern,"").toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome("0P"));
        System.out.println(isPalindrome("ab@a"));
        System.out.println(isPalindrome("Marge, let's \"[went].\" I await {news} telegram."));
        System.out.println(isPalindrome("Live on evasions? No, I save no evil."));
    }

}
