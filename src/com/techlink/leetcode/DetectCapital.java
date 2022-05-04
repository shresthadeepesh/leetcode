package com.techlink.leetcode;


public class DetectCapital {

    // TODO: Completion Remaining.
    public static boolean detectCapital(String word) {

        if(word.length() == 1) return true;

        for(char c: word.toCharArray()) {
            if(c >= 65 && c <= 90) {

            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(detectCapital("USA"));
        System.out.println(detectCapital("FLaG"));
    }

}
