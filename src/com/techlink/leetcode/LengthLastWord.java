package com.techlink.leetcode;

public class LengthLastWord {
    public int lengthOfWord(String s) {
        int count = 0;
        int length = s.length() - 1;

        while(length >=0 && s.charAt(length) == ' ') {
            length--;
        }

        while(length >= 0 && s.charAt(length) != ' ') {
            length--;
            count++;
        }

        return count;

    }

    public static void main(String[] args) {
        String s = "Hello World ";
        LengthLastWord lengthLastWord = new LengthLastWord();
        System.out.println(lengthLastWord.lengthOfWord(s));
    }
}
