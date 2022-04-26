package com.techlink.leetcode;

public class StrStr {

    public int strStr(String haystack, String needle) {
        if(haystack.equals(needle)) return 0;
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        StrStr str = new StrStr();
        System.out.println(str.strStr("hello", "ll"));
    }
}
