package com.techlink.leetcode;

import java.util.Stack;

public class BackspaceStringCompare {

    public static boolean backspaceCompare(String s, String t) {
        return removeHash(s).equals(removeHash(t));
    }

    private static String removeHash(String s) {
        Stack<Character> stack1 = new Stack<>();

        for(char c: s.toCharArray()) {
            if(c != '#') {
                stack1.push(c);
            } else if(!stack1.empty()) {
                stack1.pop();
            }
        }

        return String.valueOf(stack1);
    }

    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "ad#c"));
        System.out.println(backspaceCompare("ab##", "ad##"));
        System.out.println(backspaceCompare("a#c", "b"));
    }
}
